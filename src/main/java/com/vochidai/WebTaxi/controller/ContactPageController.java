package com.vochidai.WebTaxi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactPageController {

	@GetMapping("/contact")
	public ModelAndView about() {
		ModelAndView modelAndView = new ModelAndView("contact");
		return modelAndView;
	}
	
}
