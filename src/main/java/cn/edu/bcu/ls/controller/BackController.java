package cn.edu.bcu.ls.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
import cn.edu.bcu.ls.entity.Back;
import cn.edu.bcu.ls.entity.BackNumber;
import cn.edu.bcu.ls.service.BackService;
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
@Api(description = "Back接口")
@RestController
public class BackController {
	@Autowired
	private BackService backService;

	@ApiOperation(value = "添加回校申请，图片必填，其他填写所需部分")
	@PostMapping(value = "Back", headers = "content-type=multipart/form-data")
	public int insertBack(Back back,
			@RequestParam(value = "traffic_pics", required = false) MultipartFile[] traffic_pics,
			@RequestParam(value = "certs") MultipartFile[] cert_pics, RedirectAttributes redirectAttributes,
			HttpServletRequest request) {

		String str = "";
		for (MultipartFile multipartFile : traffic_pics) {

			str = LoadUtil.upload(multipartFile, request) + ";" + str;
		}
		back.setBackTrafficPic(str);
		for (MultipartFile multipartFile : cert_pics) {

			str = LoadUtil.upload(multipartFile, request) + ";" + str;
		}

		back.setBackCert(str);

		Date date = new Date();
		back.setBackPostTime(date);

		return backService.insertSelective(back);
	}

	@ApiOperation(value = "删除back 传入id")
	@DeleteMapping(value = "back/{back_id}")
	public int deleteBack(@PathVariable("back_id") Integer back_id) {

		return backService.deleteByPrimaryKey(back_id);

	}

	@ApiOperation(value = "修改back 传入需要")
	@PutMapping(value = "back")
	public int updataBack(Back back) {
		return backService.updateByPrimaryKeySelective(back);
	}

	@ApiOperation(value = "获得back 传入需要")
	@GetMapping(value = "back")
	public List<Back> queryBack(BackNumber backNumber) {

		List<Back> backs = backService.selectByPrimaryKey(backNumber);
		for (Back back : backs) {

			if (back.getBackCert() != null) {
				List<String> certs = Arrays.asList(back.getBackCert().split(";"));
				back.setCerts111(certs);
			}
			if (back.getBackTrafficPic() != null) {
				System.out.println(back.getBackTraffic());
				List<String> TrafficPics = Arrays.asList(back.getBackTrafficPic().split(";"));
				back.setTrafficPics(TrafficPics);
			}

		}

		return backs;
	}

}
