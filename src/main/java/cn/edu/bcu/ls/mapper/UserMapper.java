    
package cn.edu.bcu.ls.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.edu.bcu.ls.entity.User;
@Mapper
public interface UserMapper {
	boolean insertUser(User user);

	boolean deleteUser(Integer u_id);

	List<User> queryUsers();

	User queryUserById(Integer u_id);

	boolean updataUser(User user);
}