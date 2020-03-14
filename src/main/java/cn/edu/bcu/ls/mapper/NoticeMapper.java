package cn.edu.bcu.ls.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.edu.bcu.ls.entity.Notice;
import cn.edu.bcu.ls.entity.NoticeNumber;
@Mapper
public interface NoticeMapper {
    int deleteByPrimaryKey(Integer noticeId);

    int insert(Notice record);

    int insertSelective(Notice record);

    List<Notice> selectByPrimaryKey(NoticeNumber noticeNumber);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);
}