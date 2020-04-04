package cn.edu.bcu.ls.service;

import java.util.Date;
import java.util.List;

import cn.edu.bcu.ls.entity.Report;
import cn.edu.bcu.ls.entity.ReportNumber;
import cn.edu.bcu.ls.entity.ReportTemp;

public interface ReportService {
	int deleteByPrimaryKey(Integer reportId);

	int insert(Report record);

	int insertSelective(Report record);

	List<Report> selectByPrimaryKey(ReportNumber reportNumber);

	int updateByPrimaryKeySelective(Report record);

	int updateByPrimaryKey(Report record);

	List<ReportTemp> queryTemp(String user_id,String date);
}
