package cn.edu.bcu.ls.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.edu.bcu.ls.entity.Back;
import cn.edu.bcu.ls.entity.BackNumber;
@Mapper
public interface BackMapper {
    int deleteByPrimaryKey(Integer backId);

    int insert(Back record);

    int insertSelective(Back record);

    List<Back> selectByPrimaryKey(BackNumber backNumber);

    int updateByPrimaryKeySelective(Back record);

    int updateByPrimaryKey(Back record);
}