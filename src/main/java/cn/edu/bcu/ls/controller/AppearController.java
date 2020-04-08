package cn.edu.bcu.ls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.bcu.ls.service.AppearService;

@RestController
public class AppearController {
	@Autowired
	private AppearService appearService;
	
}
