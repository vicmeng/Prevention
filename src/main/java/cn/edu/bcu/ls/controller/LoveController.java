package cn.edu.bcu.ls.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.bcu.ls.entity.Clazz;
import cn.edu.bcu.ls.entity.ClazzNumber;
import cn.edu.bcu.ls.entity.Love;
import cn.edu.bcu.ls.service.ClazzService;
import cn.edu.bcu.ls.service.LoveService;
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
@Api(description = "Love接口")
@RestController
public class LoveController {
	@Autowired
	private LoveService loveService;
	@ApiOperation(value = "添加 所需的")
	@PostMapping(value = "Love")
	public int insertLove(Love love) {
		return loveService.insert(love);
	}
	@ApiOperation(value = "删除 id")
	@DeleteMapping(value = "Love/{Love_id}")
	public int deleteLove(@PathVariable("Love_id") Integer Love_id) {
		return loveService.deleteLove(Love_id);
	}
	
	@ApiOperation(value = "查看 传入所需条件 不传就是返回全部")
	@GetMapping(value = "Love")
	public List<Love> queryLoves(Love love) {
		return loveService.queryLove(love);
	}
}
