package cn.edu.bcu.ls.controller;

import java.util.Arrays;
import java.util.List;

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

import cn.edu.bcu.ls.entity.Back;
import cn.edu.bcu.ls.entity.Clazz;
import cn.edu.bcu.ls.entity.ClazzNumber;
import cn.edu.bcu.ls.entity.Setting;
import cn.edu.bcu.ls.service.ClazzService;
import cn.edu.bcu.ls.service.SettingService;
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
@Api(description = "Setting接口")
@RestController
public class SettingController {
	@Autowired
	private SettingService settingService;

	@ApiOperation(value = "添加 所需的")
	@PostMapping(value = "Setting", headers = "content-type=multipart/form-data")
	public int insertSetting(Setting setting, @RequestParam(value = "file") MultipartFile[] files,
			RedirectAttributes redirectAttributes, HttpServletRequest request) {
		
		String str = "";
		for (MultipartFile multipartFile : files) {

			str = str + ";" + LoadUtil.upload(multipartFile, request);
		}
		setting.setSettingPic(str);
		return settingService.insertSelective(setting);
	}

	@ApiOperation(value = "删除 id")
	@DeleteMapping(value = "Setting/{Setting_id}")
	public int deleteSetting(@PathVariable("Setting_id") Integer setting_id) {
		return settingService.deleteByPrimaryKey(setting_id);
	}

	@ApiOperation(value = "修改 所需属性")
	@PutMapping(value = "Setting", headers = "content-type=multipart/form-data")
	public int updataSetting(Setting setting, @RequestParam(value = "file",required=false) MultipartFile[] files,
			RedirectAttributes redirectAttributes, HttpServletRequest request) {
		String str="";
		if (files !=null) {
			for (MultipartFile multipartFile : files) {

				str = str + ";" + LoadUtil.upload(multipartFile, request);
			}
			setting.setSettingPic(str);
		}
		
		return settingService.updateByPrimaryKeySelective(setting);
	}

	@ApiOperation(value = "查看 传入所需条件 不传就是返回全部")
	@GetMapping(value = "Setting/{setting_id}")
	public Setting querySettings(@PathVariable("setting_id") Integer setting_id) {
		
		Setting setting= settingService.selectByPrimaryKey(setting_id);
		

			if (setting.getSettingPic() != null) {
				List<String> pic = Arrays.asList(setting.getSettingPic().split(";"));
				setting.setPic(pic);
			}
			

		return setting;
	}
}
