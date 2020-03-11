package cn.edu.bcu.ls.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bcu.ls.mapper.UserMapper;
import cn.edu.bcu.ls.service.UserService;
import cn.edu.bcu.ls.entity.User;
@Service
public class UserServiceImpl implements UserService {

	//依赖注入UserMapper
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		System.out.println(user);
		return userMapper.insertUser(user);
	}

}
