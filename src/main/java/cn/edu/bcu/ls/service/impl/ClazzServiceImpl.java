package cn.edu.bcu.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bcu.ls.entity.Clazz;
import cn.edu.bcu.ls.entity.ClazzNumber;
import cn.edu.bcu.ls.mapper.ClazzMapper;
import cn.edu.bcu.ls.service.ClazzService;
@Service
public class ClazzServiceImpl implements ClazzService{
	
	@Autowired
	private ClazzMapper clazzMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer clazzId) {
		// TODO Auto-generated method stub
		return clazzMapper.deleteByPrimaryKey(clazzId);
	}

	@Override
	public int insert(Clazz record) {
		// TODO Auto-generated method stub
		return clazzMapper.insert(record);
	}

	@Override
	public int insertSelective(Clazz record) {
		// TODO Auto-generated method stub
		return clazzMapper.insertSelective(record);
	}

	@Override
	public List<Clazz> selectByPrimaryKey(ClazzNumber clazzNumber) {
		// TODO Auto-generated method stub
		return clazzMapper.selectByPrimaryKey(clazzNumber);
	}

	@Override
	public int updateByPrimaryKeySelective(Clazz record) {
		// TODO Auto-generated method stub
		return clazzMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Clazz record) {
		// TODO Auto-generated method stub
		return clazzMapper.updateByPrimaryKey(record);
	}
	
}
