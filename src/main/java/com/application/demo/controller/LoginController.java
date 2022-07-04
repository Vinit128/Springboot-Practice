package com.application.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@RequestMapping(path= "/login")
	@ResponseBody
	public String helloWorld() {
		return "Hello to Alls";
	}
	
	@RequestMapping(path= "/login-jsp")
	public String helloWorldJSP() {
		return "Login";
	}
	
}
