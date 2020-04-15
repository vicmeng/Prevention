package cn.edu.bcu.ls.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.bcu.ls.service.UserService;
import cn.edu.bcu.ls.utils.OpenId;
import cn.edu.bcu.ls.utils.RedisUtil;
import cn.edu.bcu.ls.entity.Number;
import cn.edu.bcu.ls.entity.StudentIntegral;
import cn.edu.bcu.ls.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author 11379
 *
 */
//设置跨域
@CrossOrigin(origins = { "http://localhost:8080", "null" })
//swagger配置
@Api(description = "User接口")
//接口返回json数据，声明该类是Controller
@RestController
public class UserController {

	// 依赖注入UserService
	@Autowired
	private UserService userService;
	@Autowired
	private RedisUtil redisUtil;

	/**
	 * 添加用户
	 * 
	 * @param user
	 * @return
	 */
	@ApiOperation(value = "添加用户只需要填写需要的信息即可")
	@PostMapping(value = "user")
	public User insertUser(User user) {

		 userService.insertUser(user);
		 return user;
	}

	/**
	 * 按照id删除user
	 * 
	 * @param u_id
	 * @return
	 */
	@ApiOperation(value = "传入user_id删除该user")
	@DeleteMapping(value = "user/{u_id}")
	public boolean deleteUser(@PathVariable("u_id") String u_id) {

		return userService.deleteUser(u_id);

	}

	/**
	 * 查询全部用户
	 * 
	 * @return
	 */
	@ApiOperation(value = "返回所有User列表")
	@GetMapping(value = "user")
	public List<User> queryUsers() {

		return userService.queryUsers();
	}

	/**
	 * 查询单个用户
	 * 
	 * @param u_id
	 * @return
	 */
	@ApiOperation(value = "用user_id查询单个user信息")
	@GetMapping(value = "user/{u_id}")
	public User queryUserById(@PathVariable("u_id") String u_id) {

		return userService.queryUserById(u_id);

	}

	/**
	 * 修改user
	 * 
	 * @param user
	 * @return
	 */
	@ApiOperation(value = "按照user 必须传入id 其他信息按照需求即可")
	@PutMapping(value = "user")
	public int updataUser(User user) {

		return userService.updataUser(user);
	}

	@ApiOperation(value = "账户登入，管理端登入输入账号密码即可，微信小程序输入openid即可")
	@GetMapping(value = "login")
	@ResponseBody
	public User loginUser(Number number) {
		
		
		return userService.CheckUserById(number);
	}
	
	@ApiOperation(value = "老师第一次登入")
	@GetMapping(value = "teacherLogin")
	public User teacherLogin(Number number) {
		String openid=number.getUser_openid();
		number.setUser_openid(null);
		User user=userService.CheckUserById(number);
		System.out.println(user);
		if (user!=null) {
			if (openid !=null) {
				user.setUserOpenid(openid);
				if (userService.updataUser(user)>0) {
					return user;
				}
				
			}
			
		} 
		
		return user;
	}
	
	@ApiOperation(value="输入小程序端自动生成的code 返回对应的openid")
	@GetMapping(value="openid" )
	public String getOpenId(String code) throws IOException {
		return OpenId.userLogin(code);
	}
	@ApiOperation(value="输入类别学号加的分数0公告 1文章 2打卡")
	@PostMapping(value="studentScore")
	public Map<String, Object> addScore(StudentIntegral studentIntegral){
		Map<String, Object> map=new HashMap<String, Object>();
		if (redisUtil.hasKey(studentIntegral.getUser_id()+studentIntegral.getTpye())) {
			map.put("error", redisUtil.getExpire(studentIntegral.getUser_id()+studentIntegral.getTpye()));
		}else {
			redisUtil.set(studentIntegral.getUser_id()+studentIntegral.getTpye(), studentIntegral.getIntegral());
			redisUtil.expire(studentIntegral.getUser_id()+studentIntegral.getTpye(), 12*3600);
			map.put("success", userService.addScore(studentIntegral));
		}
		return map;
	}
}