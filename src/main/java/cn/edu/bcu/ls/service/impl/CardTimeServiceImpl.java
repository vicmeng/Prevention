package cn.edu.bcu.ls.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bcu.ls.entity.CardTime;
import cn.edu.bcu.ls.mapper.CardTimeMapper;
import cn.edu.bcu.ls.service.CardTimeService;
@Service
public class CardTimeServiceImpl implements CardTimeService{

	@Autowired
	private CardTimeMapper cardTimeMapper;
	
	@Override
	public int insert(CardTime record) {
		// TODO Auto-generated method stub
		return cardTimeMapper.insert(record);
	}

	@Override
	public int insertSelective(CardTime record) {
		// TODO Auto-generated method stub
		return cardTimeMapper.insertSelective(record);
	}

}
