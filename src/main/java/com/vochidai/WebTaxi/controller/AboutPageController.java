package com.vochidai.WebTaxi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AboutPageController {

	@GetMapping("/about")
	public ModelAndView about() {
		ModelAndView modelAndView = new ModelAndView("about");
		return modelAndView;
	}
	
}
