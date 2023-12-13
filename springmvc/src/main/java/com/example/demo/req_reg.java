package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class req_reg{
	@GetMapping("/call")
	public ModelAndView logic1()
	{
		ModelAndView m=new ModelAndView("Registion");
		return m;
	}

}
