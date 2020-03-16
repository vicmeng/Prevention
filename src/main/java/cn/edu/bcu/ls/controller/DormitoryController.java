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
import cn.edu.bcu.ls.entity.Dormitory;
import cn.edu.bcu.ls.entity.DormitoryNumber;
import cn.edu.bcu.ls.service.ClazzService;
import cn.edu.bcu.ls.service.DormitoryService;
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
@Api(description = "Dormitory接口")
@RestController
public class DormitoryController {
	@Autowired
	private DormitoryService dormitoryService;

	@ApiOperation(value = "添加 所需的")
	@PostMapping(value = "Dormitory")
	public int insertDormitory(Dormitory dormitory) {
		return dormitoryService.insertSelective(dormitory);
	}

	@ApiOperation(value = "删除 id")
	@DeleteMapping(value = "Dormitory/{Dormitory_id}")
	public int deleteDormitory(@PathVariable("Dormitory_id") Integer Dormitory_id) {
		return dormitoryService.deleteByPrimaryKey(Dormitory_id);
	}

	@ApiOperation(value = "修改 所需属性")
	@PutMapping(value = "Dormitory")
	public int updataDormitory(Dormitory dormitory) {
		return dormitoryService.updateByPrimaryKeySelective(dormitory);
	}

	@ApiOperation(value = "查看 传入所需条件 不传就是返回全部")
	@GetMapping(value = "Dormitory")
	public List<Dormitory> queryDormitorys(DormitoryNumber dormitoryNumber) {
		return dormitoryService.selectByPrimaryKey(dormitoryNumber);
	}
}
