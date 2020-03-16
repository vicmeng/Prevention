package cn.edu.bcu.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bcu.ls.entity.Dormitory;
import cn.edu.bcu.ls.entity.DormitoryNumber;
import cn.edu.bcu.ls.mapper.DormitoryMapper;
import cn.edu.bcu.ls.service.DormitoryService;
@Service
public class DormitoryServiceImpl implements DormitoryService {
	
	@Autowired
	private DormitoryMapper dormitoryMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer dormitoryId) {
		// TODO Auto-generated method stub
		return dormitoryMapper.deleteByPrimaryKey(dormitoryId);
	}

	@Override
	public int insert(Dormitory record) {
		// TODO Auto-generated method stub
		return dormitoryMapper.insert(record);
	}

	@Override
	public int insertSelective(Dormitory record) {
		// TODO Auto-generated method stub
		return dormitoryMapper.insertSelective(record);
	}

	@Override
	public List<Dormitory> selectByPrimaryKey(DormitoryNumber dormitoryNumber) {
		
		return dormitoryMapper.selectByPrimaryKey(dormitoryNumber);
	}

	@Override
	public int updateByPrimaryKeySelective(Dormitory record) {
		// TODO Auto-generated method stub
		return dormitoryMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Dormitory record) {
		// TODO Auto-generated method stub
		return dormitoryMapper.updateByPrimaryKey(record);
	}

}
