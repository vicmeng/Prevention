package cn.edu.bcu.ls.service;

import java.util.List;

import cn.edu.bcu.ls.entity.Leave;
import cn.edu.bcu.ls.entity.LeaveNumber;

public interface LeaveService {
	  	int deleteByPrimaryKey(Integer leaveId);

	    

	    int insertSelective(Leave record);

	    List<Leave> selectByPrimaryKey(LeaveNumber leaveNumber);

	    int updateByPrimaryKeySelective(Leave record);

	   
}
