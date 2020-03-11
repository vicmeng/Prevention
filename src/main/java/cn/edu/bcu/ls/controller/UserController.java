package cn.edu.bcu.ls.controller;

import java.util.List;

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
import cn.edu.bcu.ls.entity.User;
import io.swagger.annotations.Api;

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

	/**
	 * 添加用户
	 * 
	 * @param user
	 * @return
	 */
	@PostMapping(value = "user")
	public boolean insertUser(User user) {

		return userService.insertUser(user);

	}
	/**
	 * 按照id删除user
	 * @param u_id
	 * @return
	 */
	@DeleteMapping(value = "user/{u_id}")
	public boolean deleteUser(@PathVariable("u_id") Integer u_id) {

		return userService.deleteUser(u_id);

	}
	/**
	 * 查询全部用户
	 * @return
	 */
	@GetMapping(value="user")
	public List<User> queryUsers(){
		return userService.queryUsers();
	}
	/**
	 * 查询单个用户
	 * @param u_id
	 * @return
	 */
	@GetMapping(value="user/{u_id}")
	public User queryUserById(@PathVariable("u_id") Integer u_id) {
		
		return userService.queryUserById(u_id);
		
	}
	/**
	 * 修改user
	 * @param user
	 * @return
	 */
	@PutMapping(value="user")
	public boolean updataUser(User user) {
		return userService.updataUser(user);
	}
	
	
}