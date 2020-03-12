package cn.edu.bcu.ls.service;

import java.util.List;

import cn.edu.bcu.ls.entity.User;

public interface UserService {
	
	int insertUser(User user);

	boolean deleteUser(Integer u_id);

	List<User> queryUsers();

	

	int updataUser(User user);

	User queryUserById(String u_id);
}