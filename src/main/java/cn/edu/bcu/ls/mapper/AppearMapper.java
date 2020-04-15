package cn.edu.bcu.ls.mapper;

import cn.edu.bcu.ls.entity.Appear;
import cn.edu.bcu.ls.entity.AppearNumber;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AppearMapper {

	int insert(Appear record);

    int deleteByPrimaryKey(Integer appear_id);

    List<Appear> selectByuserid2(AppearNumber appearNumber);
}
