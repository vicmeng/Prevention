package cn.edu.bcu.ls.service.impl;

import cn.edu.bcu.ls.entity.Appear;
import cn.edu.bcu.ls.entity.AppearNumber;
import cn.edu.bcu.ls.mapper.AppearMapper;
import cn.edu.bcu.ls.service.AppearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppearServiceImpl implements AppearService {

    @Autowired
    private AppearMapper appearMapper;

    @Override
    public Appear insert(Appear record) {
        return appearMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer appear_id) {
        return appearMapper.deleteByPrimaryKey(appear_id);
    }

    @Override
    public List<Appear> selectByuserid2(AppearNumber appearNumber) {
        return appearMapper.selectByuserid2(appearNumber);
    }
}
