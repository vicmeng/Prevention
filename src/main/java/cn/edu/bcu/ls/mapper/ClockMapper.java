package cn.edu.bcu.ls.mapper;

import cn.edu.bcu.ls.entity.Clock;

public interface ClockMapper {
    int deleteByPrimaryKey(Integer clockId);

    int insert(Clock record);

    int insertSelective(Clock record);

    Clock selectByPrimaryKey(Integer clockId);

    int updateByPrimaryKeySelective(Clock record);

    int updateByPrimaryKey(Clock record);
}