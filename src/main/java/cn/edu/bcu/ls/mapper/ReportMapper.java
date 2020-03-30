package cn.edu.bcu.ls.mapper;

import java.util.List;

import cn.edu.bcu.ls.entity.Report;
import cn.edu.bcu.ls.entity.ReportNumber;
import cn.edu.bcu.ls.entity.UserDor;
import cn.edu.bcu.ls.entity.UserTemp;

public interface ReportMapper {
	int deleteByPrimaryKey(Integer reportId);

	int insert(Report record);

	int insertSelective(Report record);

	List<Report> selectByPrimaryKey(ReportNumber reportNumber);

	int updateByPrimaryKeySelective(Report record);

	int updateByPrimaryKey(Report record);

	List<UserTemp> queryTemp(String user_id);

	List<UserDor> queryUserId(String user_id);
}