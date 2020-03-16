package cn.edu.bcu.ls.service;

import java.util.List;

import cn.edu.bcu.ls.entity.Clazz;
import cn.edu.bcu.ls.entity.ClazzNumber;

public interface ClazzService {
	int deleteByPrimaryKey(Integer clazzId);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    List<Clazz> selectByPrimaryKey(ClazzNumber clazzNumber);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
}
