package cn.edu.bcu.ls.service;

import java.util.List;

import cn.edu.bcu.ls.entity.Department;
import cn.edu.bcu.ls.entity.DepartmentNumber;

public interface DepartmentService {
	int deleteByPrimaryKey(Integer depId);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByPrimaryKey(DepartmentNumber departmentNumber);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}
