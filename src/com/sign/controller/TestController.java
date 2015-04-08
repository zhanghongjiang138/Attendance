package com.sign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sign.service.UserService;
@Controller
@RequestMapping(value="/test")
public class TestController {
	@Autowired
	private UserService userService;

	@RequestMapping(value="/getTest.do")
	public String getTest(){
		userService.addUser();
		System.out.println("2");
		return "index";
	}
}
