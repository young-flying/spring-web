package com.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/test")
	public String test() {
		System.out.println("haha");
		return "/user/test";
	}
}
