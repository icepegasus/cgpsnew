package com.sk.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
	
	@RequestMapping("/")
	public String helloWorld() {
		return "HelloWorld";
	}
	
}
