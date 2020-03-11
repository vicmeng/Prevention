package cn.edu.bcu.ls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
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
@CrossOrigin(origins = {"http://localhost:8080", "null"})
//接口返回json数据，声明该类是Controller
@Api(description = "User接口")
@RestController
public class UserController {
	
	//依赖注入UserService
	@Autowired
	private UserService userService;
	
	@PostMapping(value="user")
	public boolean insertUser(User user) {
		
		if (userService.insertUser(user)) {
			return true;			
		}else {
			return false;
		}
		
	}
	
}
