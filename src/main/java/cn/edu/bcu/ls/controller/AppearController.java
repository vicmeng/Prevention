package cn.edu.bcu.ls.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.edu.bcu.ls.entity.Appear;
import cn.edu.bcu.ls.entity.AppearNumber;
import cn.edu.bcu.ls.service.AppearService;
import cn.edu.bcu.ls.utils.DownloadLocal;
import cn.edu.bcu.ls.utils.LoadExecl;
//设置跨域
@CrossOrigin(origins = { "http://localhost:8080", "null" })
@RestController
public class AppearController {
	@Autowired
	private AppearService appearService;
	
	
	
	@PostMapping(value="Appear" , headers = "content-type=multipart/form-data")
	public Appear insertAppear(Appear appear,@RequestParam(value = "file") MultipartFile files,
			RedirectAttributes redirectAttributes, HttpServletRequest request) {
		
		appear.setAppear_text(LoadExecl.upload(files, request));
		
		return appearService.insert(appear);
	}
	
	@DeleteMapping(value="Appear/{appear_id}")
	public int deleteApper(@PathVariable("appear_id") Integer appear_id) {
		return appearService.deleteByPrimaryKey(appear_id);
	}
	@GetMapping(value="Appear")
	public  List<Appear> queryAppers(AppearNumber appearNumber){
		return appearService.selectByuserid2(appearNumber);
	}
	@GetMapping(value="Excel")
	public void Excel(String ExcelString,HttpServletRequest request, HttpServletResponse response){
		DownloadLocal.downloadLocal(request, response, ExcelString);
	}
}
