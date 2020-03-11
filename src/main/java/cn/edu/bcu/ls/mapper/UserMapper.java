package cn.edu.bcu.ls.mapper;

import org.apache.ibatis.annotations.Mapper;

import cn.edu.bcu.ls.entity.User;
@Mapper
public interface UserMapper {
	boolean insertUser(User user);
}
