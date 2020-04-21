package cn.edu.bcu.ls.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import cn.edu.bcu.ls.entity.SendJosn;
import cn.edu.bcu.ls.entity.SendMessage;
import cn.edu.bcu.ls.entity.TokenJson;
import cn.edu.bcu.ls.utils.WeChatUtil;
import io.swagger.annotations.Api;
@Api(description = "WeChat接口")
@RestController
public class WechatController {
	
	
	
	
	@PostMapping(value="Send")
	public SendJosn sendJosn(SendMessage sendMessage) throws JsonMappingException, JsonProcessingException, IOException {
		return WeChatUtil.sendJosn(WeChatUtil.getAccessToken(), sendMessage);
		 
		
	}
	
}
