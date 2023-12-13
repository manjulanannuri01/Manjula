package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.BankDto;
import com.example.demo.dto.LoginDto;
import com.example.demo.model.BankModel;
import com.example.demo.service.BankService;
@RestController
public class BankController 
{
	@Autowired
	BankService service;
	private static List<BankDto> bankmodel = new ArrayList();
	ModelAndView modelAndView=new ModelAndView();
//	@PostMapping("/save")
//	public BankModel save(@RequestBody BankModel model)
//	{
//		return service.saveDetails(model);
//	}
//	@SuppressWarnings("deprecation")
//	@PostMapping("/login")
//	  public String Login(@RequestBody BankDto login) throws Exception {
//	  if((login.getPassword()==null || login.getAccountno()== 0 ||
//	  StringUtils.isEmpty(login.getAccountno()) ||
//	  StringUtils.isEmpty(login.getPassword()))) return
//	  "Account Number and password should not be Empty"; return
//	  service.loginpage(login);
//	  }
	@SuppressWarnings("deprecation")
	@PostMapping("/login")
    public ModelAndView Login(@ModelAttribute BankDto login) throws Exception 
	{
		//BankModel model=new BankModel();
	     if((login.getPassword()==null || login.getAccountno()==0 ||
	     StringUtils.isEmpty(login.getAccountno()) ||
	     StringUtils.isEmpty(login.getPassword())))
	    //return "Account Number and password should not be Empty";
	     service.loginpage(login);
	     List<BankModel> list = service.getMethod();
		 modelAndView.setViewName("output");  
		 modelAndView.addObject("listdata", list); 
		 return modelAndView;	
	 }
	
	@PostMapping("/details")
	public ModelAndView save(@ModelAttribute BankModel model)
	{    
		service .saveDetails(model);
		modelAndView.setViewName("output");        
		modelAndView.addObject("model", model);  
		List<BankModel> list = service.getMethod();
		modelAndView.setViewName("output");  
		modelAndView.addObject("listdata", list); 
		    
		      return modelAndView;
	}
	@GetMapping("/select")
	public ModelAndView getmethod()
	{      
		List<BankModel> list = service.getMethod();
		modelAndView.setViewName("output");  
		modelAndView.addObject("listdata", list); 
		 return  modelAndView;
	}	
}
