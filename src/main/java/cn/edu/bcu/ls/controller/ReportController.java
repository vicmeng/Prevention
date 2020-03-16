package cn.edu.bcu.ls.controller;

import java.util.Date;
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
import cn.edu.bcu.ls.entity.Report;
import cn.edu.bcu.ls.entity.ReportNumber;
import cn.edu.bcu.ls.service.ClazzService;
import cn.edu.bcu.ls.service.ReportService;
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
@Api(description = "Report接口")
@RestController
public class ReportController {
	@Autowired
	private ReportService reportService;

	@ApiOperation(value = "添加 所需的")
	@PostMapping(value = "Report")
	public int insertReport(Report report) {
		Date date=new Date();
		report.setReportTime(date);
		return reportService.insertSelective(report);
	}

	@ApiOperation(value = "删除 id")
	@DeleteMapping(value = "Report/{Report_id}")
	public int deleteClazz(@PathVariable("Report_id") Integer Report_id) {
		return reportService.deleteByPrimaryKey(Report_id);
	}

	@ApiOperation(value = "修改 所需属性")
	@PutMapping(value = "Report")
	public int updataReport(Report report) {
		return reportService.updateByPrimaryKeySelective(report);
	}

	@ApiOperation(value = "查看 传入所需条件 不传就是返回全部")
	@GetMapping(value = "Report")
	public List<Report> queryReports(ReportNumber reportNumber) {
		return reportService.selectByPrimaryKey(reportNumber);
	}
}
