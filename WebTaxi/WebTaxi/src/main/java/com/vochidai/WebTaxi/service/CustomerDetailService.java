package com.vochidai.WebTaxi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vochidai.WebTaxi.mapper.CustomerMapper;
import com.vochidai.WebTaxi.model.Customer;
import com.vochidai.WebTaxi.model.CustomerExample;

@Service
public class CustomerDetailService implements UserDetailsService{
	
	@Autowired
	CustomerMapper customerMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		CustomerExample customerExample = new CustomerExample();
		customerExample.createCriteria().andEmailEqualTo(username);
		List<Customer> listUser = customerMapper.selectByExample(customerExample);
		if (listUser.size() > 0) {
	        Customer customer = listUser.get(0);
	        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
	        GrantedAuthority authority = new SimpleGrantedAuthority("ADMIN");
	        grantList.add(authority);
	        UserDetails userDetails = new org.springframework.security.core.userdetails.User(
	            customer.getUsername(),
	            customer.getPassword(),
	            grantList
	        );
	        
	        return userDetails;
	    } else {
	        throw new UsernameNotFoundException("Login fail !");
	    }
	}
	
}
