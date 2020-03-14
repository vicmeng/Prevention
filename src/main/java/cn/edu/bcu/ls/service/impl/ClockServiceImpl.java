package cn.edu.bcu.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bcu.ls.entity.Clock;
import cn.edu.bcu.ls.entity.ClockNumber;
import cn.edu.bcu.ls.mapper.ClockMapper;
import cn.edu.bcu.ls.service.ClockService;
@Service
public class ClockServiceImpl implements ClockService {
	
	@Autowired
	private ClockMapper clockMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer clockId) {
		// TODO Auto-generated method stub
		return clockMapper.deleteByPrimaryKey(clockId);
	}

	@Override
	public int insert(Clock record) {
		// TODO Auto-generated method stub
		return clockMapper.insert(record);
	}

	@Override
	public int insertSelective(Clock record) {
		// TODO Auto-generated method stub
		return clockMapper.insertSelective(record);
	}

	@Override
	public List<Clock> selectByPrimaryKey(ClockNumber clockNumber) {
		// TODO Auto-generated method stub
		return clockMapper.selectByPrimaryKey(clockNumber);
	}

	@Override
	public int updateByPrimaryKeySelective(Clock record) {
		// TODO Auto-generated method stub
		return clockMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Clock record) {
		// TODO Auto-generated method stub
		return clockMapper.updateByPrimaryKey(record);
	}

}
