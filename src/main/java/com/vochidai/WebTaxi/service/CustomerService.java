package com.vochidai.WebTaxi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.vochidai.WebTaxi.mapper.CustomerMapper;
import com.vochidai.WebTaxi.model.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	CustomerMapper customerMapper;

	public void registerCustomer(Customer customer) {
		String encodePassword = passwordEncoder.encode(customer.getPassword());
		customer.setPassword(encodePassword);
		
		customerMapper.insertCustomer(customer);
	}
	
}
