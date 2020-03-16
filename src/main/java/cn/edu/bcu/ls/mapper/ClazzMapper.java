package cn.edu.bcu.ls.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.edu.bcu.ls.entity.Clazz;
import cn.edu.bcu.ls.entity.ClazzNumber;
@Mapper
public interface ClazzMapper {
    int deleteByPrimaryKey(Integer clazzId);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    List<Clazz> selectByPrimaryKey(ClazzNumber clazzNumber);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
}