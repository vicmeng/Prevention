package cn.edu.bcu.ls.mapper;

import java.util.List;

import cn.edu.bcu.ls.entity.Leave;
import cn.edu.bcu.ls.entity.LeaveNumber;

public interface LeaveMapper {
    int deleteByPrimaryKey(Integer leaveId);

    int insert(Leave record);

    int insertSelective(Leave record);

    List<Leave> selectByPrimaryKey(LeaveNumber leaveNumber);

    int updateByPrimaryKeySelective(Leave record);

    int updateByPrimaryKey(Leave record);
}