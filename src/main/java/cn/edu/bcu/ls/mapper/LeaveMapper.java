package cn.edu.bcu.ls.mapper;

import cn.edu.bcu.ls.entity.Leave;

public interface LeaveMapper {
    int deleteByPrimaryKey(Integer leaveId);

    int insert(Leave record);

    int insertSelective(Leave record);

    Leave selectByPrimaryKey(Integer leaveId);

    int updateByPrimaryKeySelective(Leave record);

    int updateByPrimaryKey(Leave record);
}