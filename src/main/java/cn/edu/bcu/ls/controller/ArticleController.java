package cn.edu.bcu.ls.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.edu.bcu.ls.entity.Article;
import cn.edu.bcu.ls.entity.ArticleNumber;
import cn.edu.bcu.ls.service.ArticleService;
import cn.edu.bcu.ls.utils.LoadUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author 11379
 *
 */
//设置跨域
@CrossOrigin(origins = { "http://localhost:8080", "null" })

//swagger配置
@Api(description = "Article接口")
@RestController
public class ArticleController {
	@Autowired
	private ArticleService articleService;

	/**
	 * 
	 * @param article
	 * @param file
	 * @param redirectAttributes
	 * @param request
	 * @return
	 */
	@ApiOperation(value = "图片和 文章分别传送，图片必填，文章填写所需部分")
	@PostMapping(value = "Article")
	public int insertArticle(Article article) {

		Date date = new Date();
		date.setHours(date.getHours()+8);
		article.setArticleDate(date);
		return articleService.insertSelective(article);
	}

	@ApiOperation(value = "按照id删除")
	@DeleteMapping(value = "Article/{article_id}")
	public int delArticle(@PathVariable("article_id") Integer article_id) {
		return articleService.deleteByPrimaryKey(article_id);
	}

	@ApiOperation(value = "按照id更改文章")
	@PutMapping(value = "Article")
	public int updateArticle(Article article) {
		

		return articleService.updateByPrimaryKeySelective(article);
	}

	@ApiOperation(value = "查看文章，传入需要的参数即可")
	@GetMapping(value = "Article")
	public List<Article> queryArticles(ArticleNumber articleNumber) {
		
		List<Article> articles = articleService.selectByNumber(articleNumber);
		for (Article article : articles) {

			if (article.getArticlePic() != null) {
				String[] img = article.getArticlePic().split(";");
				article.setImgs(img);
			}

		}

		
		return articles;

	}
	
	@ApiOperation(value="上传图片")
	@PostMapping(value="Images" , headers = "content-type=multipart/form-data")
	public String getImages( @RequestParam(value = "file") MultipartFile files,
			RedirectAttributes redirectAttributes, HttpServletRequest request) {
				return LoadUtil.upload(files, request);
		
	}
	
	
	@ApiOperation(value = "管理端查看文章，传入需要的参数即可")
	@GetMapping(value = "ArticleAdmin")
	public List<Article> queryArticlesAdmin(ArticleNumber articleNumber) {
		
		List<Article> articles = articleService.selectByNumberAdmin(articleNumber);
		
		
		return articles;

	}
}
