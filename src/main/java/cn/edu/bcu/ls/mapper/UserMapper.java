package cn.edu.bcu.ls.mapper;

import cn.edu.bcu.ls.entity.Number;
import cn.edu.bcu.ls.entity.User;
import java.util.List;

public interface UserMapper {
	int deleteByPrimaryKey(String userId);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(String userId);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	boolean insertUser(User user);

	boolean deleteUser(String u_id);

	List<User> queryUsers();

	User queryUserById(Integer u_id);

	boolean updataUser(User user);

	User CheckUserById(Number number);
}