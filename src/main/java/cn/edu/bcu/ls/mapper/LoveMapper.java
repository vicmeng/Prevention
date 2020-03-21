package cn.edu.bcu.ls.mapper;

import java.util.List;

import cn.edu.bcu.ls.entity.Love;

public interface LoveMapper {
	int insert(Love record);

	int deleteLove(Love love);
	
	List<Love> queryLove(Love love);

	int insertSelective(Love record);

	
}