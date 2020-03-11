package cn.edu.bcu.ls.mapper;

import cn.edu.bcu.ls.entity.Love;

public interface LoveMapper {
    int insert(Love record);

    int insertSelective(Love record);
}