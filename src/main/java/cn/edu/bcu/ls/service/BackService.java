package cn.edu.bcu.ls.service;

import java.util.List;

import cn.edu.bcu.ls.entity.Back;
import cn.edu.bcu.ls.entity.BackNumber;

public interface BackService {
	 int deleteByPrimaryKey(Integer backId);

	    int insert(Back record);

	    Back insertSelective(Back record);

	    List<Back> selectByPrimaryKey(BackNumber backNumber);

	    int updateByPrimaryKeySelective(Back record);

	    int updateByPrimaryKey(Back record);
}
