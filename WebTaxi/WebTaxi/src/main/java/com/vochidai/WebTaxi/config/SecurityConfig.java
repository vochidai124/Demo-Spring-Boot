package com.vochidai.WebTaxi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.vochidai.WebTaxi.service.CustomerDetailService;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	CustomerDetailService customerDetailService;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/index/**","/about","/css/**", "/js/**", "/images/**").permitAll() // Cho phép truy cập vào các tài nguyên tĩnh
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .successHandler(successHandler())
                .failureHandler(failureHandler())
                .loginProcessingUrl("/j_spring_security_check");
    }
    
    private AuthenticationSuccessHandler successHandler() {
        return (request, response, authentication) -> {
            response.sendRedirect("/index");
        };
    }
    
    private AuthenticationFailureHandler failureHandler() {
        return (request, response, exception) -> {
            String errorMessage = "Username hoặc Password không đúng!";
            request.getSession().setAttribute("errorMessage", errorMessage);
            response.sendRedirect("/login");
        };
    }
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
    	auth.userDetailsService(customerDetailService).passwordEncoder(passwordEncoder());
//    	auth.inMemoryAuthentication()
//    	.withUser("user").password(passwordEncoder().encode("123"))
//    	.authorities("ROLE_USER");
    }
}