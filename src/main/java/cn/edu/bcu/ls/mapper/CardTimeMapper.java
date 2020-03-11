package cn.edu.bcu.ls.mapper;

import cn.edu.bcu.ls.entity.CardTime;

public interface CardTimeMapper {
    int insert(CardTime record);

    int insertSelective(CardTime record);
}