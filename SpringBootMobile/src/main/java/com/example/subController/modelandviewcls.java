package com.example.subController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class modelandviewcls {
	
	@RequestMapping("/fileupload")
	public ModelAndView upload()
	{
		ModelAndView m1=new ModelAndView("fileupload");
		return m1;
		
	}
}
