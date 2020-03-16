package cn.edu.bcu.ls.mapper;

import org.apache.ibatis.annotations.Mapper;

import cn.edu.bcu.ls.entity.CardTime;
@Mapper
public interface CardTimeMapper {
    int insert(CardTime record);

    int insertSelective(CardTime record);
}