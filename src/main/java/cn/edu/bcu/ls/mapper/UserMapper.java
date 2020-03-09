package cn.edu.bcu.ls.mapper;

import org.apache.ibatis.annotations.Mapper;

import cn.eud.bcu.ls.entity.User;
@Mapper
public interface UserMapper {
	boolean insertUser(User user);
}
