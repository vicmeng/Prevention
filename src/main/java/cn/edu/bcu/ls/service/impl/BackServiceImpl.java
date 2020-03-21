package cn.edu.bcu.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bcu.ls.entity.Back;
import cn.edu.bcu.ls.entity.BackNumber;
import cn.edu.bcu.ls.mapper.BackMapper;
import cn.edu.bcu.ls.service.BackService;
@Service
public class BackServiceImpl implements BackService {

	@Autowired
	private BackMapper backMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer backId) {
		// TODO Auto-generated method stub
		return backMapper.deleteByPrimaryKey(backId);
	}

	@Override
	public int insert(Back record) {
		// TODO Auto-generated method stub
		return backMapper.insert(record);
	}

	@Override
	public int insertSelective(Back record) {
		// TODO Auto-generated method stub
		return backMapper.insertSelective(record);
	}

	@Override
	public List<Back> selectByPrimaryKey(BackNumber backNumber) {
		// TODO Auto-generated method stub
		return backMapper.selectByPrimaryKey(backNumber);
	}

	@Override
	public int updateByPrimaryKeySelective(Back record) {
		// TODO Auto-generated method stub
		return backMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Back record) {
		// TODO Auto-generated method stub
		return backMapper.updateByPrimaryKey(record);
	}

}
