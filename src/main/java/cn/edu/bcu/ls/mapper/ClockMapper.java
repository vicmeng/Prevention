package cn.edu.bcu.ls.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.edu.bcu.ls.entity.Clock;
import cn.edu.bcu.ls.entity.ClockNumber;
@Mapper
public interface ClockMapper {
    int deleteByPrimaryKey(Integer clockId);

    int insert(Clock record);

    int insertSelective(Clock record);

    List<Clock> selectByPrimaryKey(ClockNumber clockNumber);

    int updateByPrimaryKeySelective(Clock record);

    int updateByPrimaryKey(Clock record);
}