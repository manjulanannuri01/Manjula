package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class SecurityConfig   {
//	
//
//	@Bean
//	public BCryptPasswordEncoder bCryptPasswordEncoder() {
//	    return new BCryptPasswordEncoder();
//	}
	@Autowired
	AuthenticationService authenticationService;
////	
////	public void configure(WebSecurity web) throws Exception {
////		
////		 web.ignoring().requestMatchers("/resources/**");
////	}
////	protected  void configure(AuthenticationManagerBuilder auth) throws Exception{
////
////		  auth.userDetailsService(authenticationService)
////	      .passwordEncoder(new BCryptPasswordEncoder());
////		//auth.userDetailsService( authenticationService).passwordEncoder(bCryptPasswordEncoder());
////	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
}
