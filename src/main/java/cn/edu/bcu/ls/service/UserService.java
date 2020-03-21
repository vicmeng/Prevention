package cn.edu.bcu.ls.service;

import java.util.List;

import cn.edu.bcu.ls.entity.Number;
import cn.edu.bcu.ls.entity.User;

public interface UserService {

	int insertUser(User user);

	boolean deleteUser(String u_id);

	List<User> queryUsers();

	User CheckUserById(Number number);

	int updataUser(User user);

	User queryUserById(String u_id);
}