package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Order;
import com.example.demo.model.User;
import com.example.demo.service.SampleService;

@RestController
public class SampleController {
	@Autowired
	SampleService sampleService;
	
	@PostMapping("user")
	public User user(@RequestBody User user) {
		return sampleService.usermethod(user);
	}
	
	public Order order(@RequestBody Order order) {
		return sampleService.ordermethod(order);
		
	}
	

}
//ManuAmmu@587
