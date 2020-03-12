package cn.edu.bcu.ls.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.edu.bcu.ls.entity.Article;
import cn.edu.bcu.ls.entity.ArticleNumber;

@Mapper
public interface ArticleMapper {
	int deleteByPrimaryKey(Integer articleId);

	int insert(Article record);

	int insertSelective(Article record);

	Article selectByPrimaryKey(Integer articleId);

	int updateByPrimaryKeySelective(Article record);

	int updateByPrimaryKey(Article record);

	List<Article> selectByNumber(ArticleNumber articleNumber);
}