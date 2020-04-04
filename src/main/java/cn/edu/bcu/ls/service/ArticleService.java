package cn.edu.bcu.ls.service;

import java.util.List;

import cn.edu.bcu.ls.entity.Article;
import cn.edu.bcu.ls.entity.ArticleNumber;

public interface ArticleService {
	int deleteByPrimaryKey(Integer articleId);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer articleId);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);
    
    List<Article> selectByNumber(ArticleNumber articleNumber);
    
    List<Article> selectByNumberAdmin(ArticleNumber articleNumber);
}
