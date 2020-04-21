package cn.edu.bcu.ls.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
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
	public SendJosn sendJosn(SendMessage sendMessage)
			throws JsonMappingException, JsonProcessingException, IOException {
		
		Map<String, Object> map=new HashMap<String, Object>();
		Map<String, Object> map2=new HashMap<String, Object>();
		map2.put("value","ls");
		Map<String, Object> map3=new HashMap<String, Object>();
		map3.put("value","2019年10月1日 15:01");
		Map<String, Object> map4=new HashMap<String, Object>();
		map4.put("value","也挺好");
		map.put("name1", map2);
		map.put("time2", map3);
		map.put("thing3", map4);
		
		sendMessage.setData(map);
		System.out.println("1");
		  String  param= JSON.toJSONString(sendMessage);
		  System.out.println(param);
		return WeChatUtil.sendJosn(WeChatUtil.getAccessToken(), param);
		 
		
	}
	
}
