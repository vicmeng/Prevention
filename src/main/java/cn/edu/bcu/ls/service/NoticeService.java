package cn.edu.bcu.ls.service;

import java.util.List;

import cn.edu.bcu.ls.entity.Notice;
import cn.edu.bcu.ls.entity.NoticeNumber;

public interface NoticeService {
	 	int deleteByPrimaryKey(Integer noticeId);

	    int insert(Notice record);

	    int insertSelective(Notice record);

	    List<Notice> selectByPrimaryKey(NoticeNumber noticeNumber);

	    int updateByPrimaryKeySelective(Notice record);

	    int updateByPrimaryKey(Notice record);
}
