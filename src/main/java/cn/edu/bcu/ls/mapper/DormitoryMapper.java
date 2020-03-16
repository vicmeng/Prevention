package cn.edu.bcu.ls.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.edu.bcu.ls.entity.Dormitory;
import cn.edu.bcu.ls.entity.DormitoryNumber;
@Mapper
public interface DormitoryMapper {
    int deleteByPrimaryKey(Integer dormitoryId);

    int insert(Dormitory record);

    int insertSelective(Dormitory record);

    List<Dormitory> selectByPrimaryKey(DormitoryNumber dormitoryNumber);

    int updateByPrimaryKeySelective(Dormitory record);

    int updateByPrimaryKey(Dormitory record);
}