package com.vochidai.WebTaxi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ServicePageController {

	@GetMapping("/service")
	public ModelAndView detail() {
		ModelAndView modelAndView = new ModelAndView("service");
		return modelAndView;
	}
	
}
