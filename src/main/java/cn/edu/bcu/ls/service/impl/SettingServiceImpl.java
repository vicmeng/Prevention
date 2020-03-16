package cn.edu.bcu.ls.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bcu.ls.entity.Setting;
import cn.edu.bcu.ls.mapper.SettingMapper;
import cn.edu.bcu.ls.service.SettingService;
@Service
public class SettingServiceImpl implements SettingService {

	
	@Autowired
	private SettingMapper settingMapper;
	
	
	@Override
	public int deleteByPrimaryKey(Integer settingId) {
		// TODO Auto-generated method stub
		return settingMapper.deleteByPrimaryKey(settingId);
	}

	@Override
	public int insert(Setting record) {
		// TODO Auto-generated method stub
		return settingMapper.insert(record);
	}

	@Override
	public int insertSelective(Setting record) {
		// TODO Auto-generated method stub
		return settingMapper.insertSelective(record);
	}

	@Override
	public Setting selectByPrimaryKey(Integer settingId) {
		// TODO Auto-generated method stub
		return settingMapper.selectByPrimaryKey(settingId);
	}

	@Override
	public int updateByPrimaryKeySelective(Setting record) {
		// TODO Auto-generated method stub
		return settingMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Setting record) {
		// TODO Auto-generated method stub
		return settingMapper.updateByPrimaryKey(record);
	}

}
