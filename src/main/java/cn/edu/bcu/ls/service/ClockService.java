package cn.edu.bcu.ls.service;

import java.util.List;

import cn.edu.bcu.ls.entity.Clock;
import cn.edu.bcu.ls.entity.ClockNumber;

public interface ClockService {
	int deleteByPrimaryKey(Integer clockId);

    int insert(Clock record);

    int insertSelective(Clock record);

    List<Clock> selectByPrimaryKey(ClockNumber clockNumber);

    int updateByPrimaryKeySelective(Clock record);

    int updateByPrimaryKey(Clock record);
}
