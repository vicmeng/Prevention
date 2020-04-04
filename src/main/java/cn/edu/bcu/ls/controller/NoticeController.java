package cn.edu.bcu.ls.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.edu.bcu.ls.entity.Article;
import cn.edu.bcu.ls.entity.Notice;
import cn.edu.bcu.ls.entity.NoticeNumber;
import cn.edu.bcu.ls.service.NoticeService;
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
@Api(description = "Notice接口")
@RestController
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	@ApiOperation(value = "添加notice，传入需要的参数即可,图片可以多传")
	@PostMapping(value = "notice", headers = "content-type=multipart/form-data")
	public int insertNotice(Notice notice, @RequestParam(value = "file") MultipartFile[] files,
			RedirectAttributes redirectAttributes, HttpServletRequest request) {
		String str = "";
		for (MultipartFile multipartFile : files) {

			str = LoadUtil.upload(multipartFile, request) + ";" + str;
		}
		notice.setNoticePic(str);
		

		Date date=new Date();
		date.setHours(date.getHours()+8);
		notice.setNoticeDate(date);
		return noticeService.insertSelective(notice);
	}
	@ApiOperation(value = "删除notice，传入需要的参数即可")
	@DeleteMapping(value = "notice/{notice_id}")
	public int deleteNotice(@PathVariable("notice_id") Integer notice_id) {
		return noticeService.deleteByPrimaryKey(notice_id);
	}
	@ApiOperation(value = "修改notice，传入需要的参数即可,图片修改功能未开放")
	@PutMapping(value="notice")
	public int updataNotice(Notice notice) {
		return noticeService.updateByPrimaryKeySelective(notice);
	}
	@ApiOperation(value = "查询notice，传入需要的参数即可,图片的key是id值")
	@GetMapping(value="notice")
	public List<Notice> queryNotice(NoticeNumber noticeNumber){
		
		 List<Notice> notices= noticeService.selectByPrimaryKey(noticeNumber);
		 for (Notice notice : notices) {
				
				if(notice.getNoticePic()!=null) {
					String[] img=notice.getNoticePic().split(";");
					notice.setImgs(img);
				}

			}
		 
		 
		 return notices;
	}

}
