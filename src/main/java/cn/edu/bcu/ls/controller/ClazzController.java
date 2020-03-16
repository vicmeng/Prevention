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
import cn.edu.bcu.ls.service.ClazzService;
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
@Api(description = "Clazz接口")
@RestController
public class ClazzController {
	@Autowired
	private ClazzService clazzService;
	@ApiOperation(value = "添加 所需的")
	@PostMapping(value = "clazz")
	public int insertClazz(Clazz clazz) {
		return clazzService.insertSelective(clazz);
	}
	@ApiOperation(value = "删除 id")
	@DeleteMapping(value = "clazz/{clazz_id}")
	public int deleteClazz(@PathVariable("clazz_id") Integer clazz_id) {
		return clazzService.deleteByPrimaryKey(clazz_id);
	}
	@ApiOperation(value = "修改 所需属性")
	@PutMapping(value = "clazz")
	public int updataClazz(Clazz clazz) {
		return clazzService.updateByPrimaryKeySelective(clazz);
	}
	@ApiOperation(value = "查看 传入所需条件 不传就是返回全部")
	@GetMapping(value = "clazz")
	public List<Clazz> queryClazzs(ClazzNumber clazzNumber) {
		return clazzService.selectByPrimaryKey(clazzNumber);
	}
}
