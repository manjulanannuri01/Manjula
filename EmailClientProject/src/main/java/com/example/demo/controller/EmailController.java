package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmailDetails;
import com.example.demo.service.EmailService;

@RestController
public class EmailController {
	@Autowired
	EmailService emailService;
	
	@PostMapping("sendemail")
	public String senddetails(@RequestBody EmailDetails emailDetails)
	{
		 return emailService.sendEmail(emailDetails);
		
	}

}
