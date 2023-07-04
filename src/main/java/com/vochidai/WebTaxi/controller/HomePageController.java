package com.vochidai.WebTaxi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {

//    @Autowired
//    UsersMapper usersMapper;
    
	@GetMapping(value = {"/index","/"})
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}
}
