package cn.edu.bcu.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bcu.ls.entity.Love;
import cn.edu.bcu.ls.mapper.LoveMapper;
import cn.edu.bcu.ls.service.LoveService;
@Service
public class LoveServiceImpl implements LoveService{

	@Autowired
	private LoveMapper loveMapper;
	
	@Override
	public int insert(Love record) {
		// TODO Auto-generated method stub
		return loveMapper.insert(record);
	}

	@Override
	public int deleteLove(Integer love_id) {
		// TODO Auto-generated method stub
		return loveMapper.deleteLove(love_id);
	}

	@Override
	public List<Love> queryLove(Love love) {
		// TODO Auto-generated method stub
		return loveMapper.queryLove(love);
	}

}
