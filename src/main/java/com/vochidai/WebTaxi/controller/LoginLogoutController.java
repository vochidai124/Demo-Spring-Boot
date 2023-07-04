package com.vochidai.WebTaxi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vochidai.WebTaxi.model.Customer;
import com.vochidai.WebTaxi.service.CustomerService;

@Controller
public class LoginLogoutController {
	@Autowired
	CustomerService customerService;
		
	@ModelAttribute("customer")
    public Customer getDefaultCustomer() {
        return new Customer();
    }
	
	@GetMapping("/login")
    public ModelAndView login() {

        ModelAndView modelAndView = new ModelAndView("Login");

        return modelAndView;
    }
	
	@PostMapping("/register")
    public String processRegister(@ModelAttribute("customer") Customer customer) {
		customerService.registerCustomer(customer);
		
        return "redirect:/index";
    }
}
