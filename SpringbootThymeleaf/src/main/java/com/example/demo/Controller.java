package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {
	@Autowired
	DataCls data;
	
	@PostMapping("/create")
	public ModelAndView details(@ModelAttribute DataCls data)
	{
		ModelAndView model=new ModelAndView("Index");
		return model;
	}

}
