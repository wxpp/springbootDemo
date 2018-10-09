package com.codinger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value="/hello")
	public String hello() {
		return "hello world!";
	}
	
	@RequestMapping(value="/index.html")
	public String index() {
		return "index!";
	}
}