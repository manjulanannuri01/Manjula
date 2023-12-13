package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class user_ctrl {

	public user_ctrl() {
		// TODO Auto-generated constructor stub
		
	}
	@GetMapping("/resp_ctrl")
	public String save()
	//public String save(@RequestParam String name,@RequestParam String email,@RequestParam String password)
	
	{
		return "welcome";
	//	return"welcome"+name+"email"+email+ "password"+password;
	}

}
