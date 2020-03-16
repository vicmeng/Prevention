package cn.edu.bcu.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bcu.ls.entity.Report;
import cn.edu.bcu.ls.entity.ReportNumber;
import cn.edu.bcu.ls.mapper.ReportMapper;
import cn.edu.bcu.ls.service.ReportService;
@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportMapper reportMapper;
	
	
	@Override
	public int deleteByPrimaryKey(Integer reportId) {
		// TODO Auto-generated method stub
		return reportMapper.deleteByPrimaryKey(reportId);
	}

	@Override
	public int insert(Report record) {
		// TODO Auto-generated method stub
		return reportMapper.insert(record);
	}

	@Override
	public int insertSelective(Report record) {
		// TODO Auto-generated method stub
		return reportMapper.insertSelective(record);
	}

	@Override
	public List<Report> selectByPrimaryKey(ReportNumber reportNumber) {
		// TODO Auto-generated method stub
		return reportMapper.selectByPrimaryKey(reportNumber);
	}

	@Override
	public int updateByPrimaryKeySelective(Report record) {
		// TODO Auto-generated method stub
		return reportMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Report record) {
		// TODO Auto-generated method stub
		return reportMapper.updateByPrimaryKey(record);
	}

}
