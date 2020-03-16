package cn.edu.bcu.ls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.bcu.ls.entity.CardTime;
import cn.edu.bcu.ls.service.CardTimeService;
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
@Api(description = "CardTime接口")
@RestController
public class CardTimeController {
	@Autowired
	private CardTimeService cardTimeService;
	@ApiOperation(value = "CardTime添加 除了id都要填")
	@PostMapping(value="CardTime")
	public int insertCardTime(CardTime record) {
		return cardTimeService.insert(record);
	}
}
