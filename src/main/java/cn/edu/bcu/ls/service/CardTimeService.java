package cn.edu.bcu.ls.service;

import cn.edu.bcu.ls.entity.CardTime;

public interface CardTimeService {
	int insert(CardTime record);

    int insertSelective(CardTime record);
}
