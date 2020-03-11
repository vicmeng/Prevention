package cn.edu.bcu.ls.service;

import java.util.List;

import cn.eud.bcu.ls.entity.User;

public interface UserService {
	
	boolean insertUser(User user);

	boolean deleteUser(Integer u_id);

	List<User> queryUsers();

	User queryUserById(Integer u_id);

	boolean updataUser(User user);
}
