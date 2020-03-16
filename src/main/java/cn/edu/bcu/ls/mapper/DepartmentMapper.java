package cn.edu.bcu.ls.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.edu.bcu.ls.entity.Department;
import cn.edu.bcu.ls.entity.DepartmentNumber;
@Mapper
public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer depId);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByPrimaryKey(DepartmentNumber departmentNumber);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}