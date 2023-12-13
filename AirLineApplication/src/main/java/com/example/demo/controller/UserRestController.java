package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;
import com.example.demo.user.User;

@RestController
public class UserRestController {
		@Autowired
		UserService userService;
		//@Autowired
	    //private BCryptPasswordEncoder bCryptPasswordEncoder;

		@PostMapping( "/register") 
		public User registerFormSubmit(@RequestBody User user) {
			 return  userService.registerForm(user);
		
		}

	}



