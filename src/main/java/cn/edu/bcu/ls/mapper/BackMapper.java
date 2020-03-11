package cn.edu.bcu.ls.mapper;

import cn.edu.bcu.ls.entity.Back;

public interface BackMapper {
    int deleteByPrimaryKey(Integer backId);

    int insert(Back record);

    int insertSelective(Back record);

    Back selectByPrimaryKey(Integer backId);

    int updateByPrimaryKeySelective(Back record);

    int updateByPrimaryKey(Back record);
}