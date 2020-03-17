package cn.edu.bcu.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bcu.ls.entity.Leave;
import cn.edu.bcu.ls.entity.LeaveNumber;
import cn.edu.bcu.ls.mapper.LeaveMapper;
import cn.edu.bcu.ls.service.LeaveService;
@Service
public class LeaveServiceImpl implements LeaveService{
	
	@Autowired
	private LeaveMapper leaveMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer leaveId) {
		// TODO Auto-generated method stub
		return leaveMapper.deleteByPrimaryKey(leaveId);
	}

	@Override
	public int insertSelective(Leave record) {
		// TODO Auto-generated method stub
		return leaveMapper.insertSelective(record);
	}

	@Override
	public List<Leave> selectByPrimaryKey(LeaveNumber leaveNumber) {
		// TODO Auto-generated method stub
		return leaveMapper.selectByPrimaryKey(leaveNumber);
	}

	@Override
	public int updateByPrimaryKeySelective(Leave record) {
		// TODO Auto-generated method stub
		return leaveMapper.updateByPrimaryKeySelective(record);
	}

}
