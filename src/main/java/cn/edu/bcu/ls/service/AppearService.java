package cn.edu.bcu.ls.service;

import cn.edu.bcu.ls.entity.Appear;
import cn.edu.bcu.ls.entity.AppearNumber;

import java.util.List;

public interface AppearService {
	Appear insert(Appear record);

    int deleteByPrimaryKey(Integer appear_id);

    List<Appear> selectByuserid2(AppearNumber appearNumber);

}
