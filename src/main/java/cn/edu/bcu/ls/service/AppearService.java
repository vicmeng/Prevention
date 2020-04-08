package cn.edu.bcu.ls.service;

import cn.edu.bcu.ls.entity.Appear;

import java.util.List;

public interface AppearService {
    int insert(Appear record);

    int deleteByPrimaryKey(Integer appear_id);

    List<Appear> selectByuserid2(String user_id2);

}
