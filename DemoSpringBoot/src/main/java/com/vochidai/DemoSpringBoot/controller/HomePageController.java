package com.vochidai.DemoSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

	@GetMapping("/")
	public String Home() {
		return "Home";
	}
}
