package cn.edu.bcu.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bcu.ls.mapper.UserMapper;
import cn.edu.bcu.ls.service.UserService;
import cn.edu.bcu.ls.entity.Number;
import cn.edu.bcu.ls.entity.User;

@Service
public class UserServiceImpl implements UserService {

	// 依赖注入UserMapper
	@Autowired
	private UserMapper userMapper;

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.insertSelective(user);
	}

	@Override
	public boolean deleteUser(Integer u_id) {
		// TODO Auto-generated method stub
		return userMapper.deleteUser(u_id);
	}

	@Override
	public List<User> queryUsers() {
		// TODO Auto-generated method stub
		return userMapper.queryUsers();
	}

	@Override
	public User queryUserById(String u_id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(u_id);
	}

	@Override
	public int updataUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public int CheckUserById(Number number) {
		// TODO Auto-generated method stub
		return userMapper.CheckUserById(number);
	}

}