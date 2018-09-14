package com.banxue.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
作者：fengchase
时间：2018年9月14日
文件：TestController.java
项目：banxue-frontend
*/
@Controller
@RequestMapping("/banxue")
public class TestController {
	
	@RequestMapping("/test")
	public String test() {
		System.out.println("测试用例");
		return "error/500";
	}

	
}

