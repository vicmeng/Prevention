package cn.edu.bcu.ls.mapper;

import cn.edu.bcu.ls.entity.Clazz;

public interface ClazzMapper {
    int deleteByPrimaryKey(Integer clazzId);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    Clazz selectByPrimaryKey(Integer clazzId);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
}