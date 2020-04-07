package cn.edu.bcu.ls.controller;

import java.util.Date;
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

import cn.edu.bcu.ls.entity.Clazz;
import cn.edu.bcu.ls.entity.ClazzNumber;
import cn.edu.bcu.ls.entity.Leave;
import cn.edu.bcu.ls.entity.LeaveNumber;
import cn.edu.bcu.ls.service.ClazzService;
import cn.edu.bcu.ls.service.LeaveService;
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
@Api(description = "Leave接口")
@RestController
public class LeaveController {
	@Autowired
	private LeaveService leaveService;
	@ApiOperation(value = "添加 所需的")
	@PostMapping(value = "Leave" , headers = "content-type=application/json")
	public int insertLeave(Leave leave) {
		Date date=new Date();
		leave.setLeavePostDate(date);
	
		return leaveService.insertSelective(leave);
	}
	@ApiOperation(value = "删除 id")
	@DeleteMapping(value = "Leave/{Leave_id}")
	public int deleteLeave(@PathVariable("Leave_id") Integer Leave_id) {
		return leaveService.deleteByPrimaryKey(Leave_id);
	}
	@ApiOperation(value = "修改 所需属性")
	@PutMapping(value = "Leave")
	public int updataLeave(Leave leave) {
		return leaveService.updateByPrimaryKeySelective(leave);
	}
	@ApiOperation(value = "查看 传入所需条件 不传就是返回全部")
	@GetMapping(value = "Leave")
	public List<Leave> queryLeaves(LeaveNumber leaveNumber) {
		return leaveService.selectByPrimaryKey(leaveNumber);
	}
}
