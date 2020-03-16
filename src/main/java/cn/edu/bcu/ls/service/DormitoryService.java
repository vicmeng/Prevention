package cn.edu.bcu.ls.service;

import java.util.List;

import cn.edu.bcu.ls.entity.Dormitory;
import cn.edu.bcu.ls.entity.DormitoryNumber;

public interface DormitoryService {
	int deleteByPrimaryKey(Integer dormitoryId);

    int insert(Dormitory record);

    int insertSelective(Dormitory record);

    List<Dormitory> selectByPrimaryKey(DormitoryNumber dormitoryNumber);

    int updateByPrimaryKeySelective(Dormitory record);

    int updateByPrimaryKey(Dormitory record);
}
