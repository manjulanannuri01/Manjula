package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.File_Data;
import com.example.demo.model.Mobile_Data;

import com.example.demo.service.Mobile_Service;
import com.example.demo.service.Mobile_Service_Impl;
@RestController
public class Mobile_Controller {
	@Autowired
	Mobile_Data mobiledata;
	
	@Autowired(required=false)
	Mobile_Service mobileservice;
	
	@PostMapping("/savemethod" )
	
	public Mobile_Data mobilesave(@RequestBody Mobile_Data mobile_data)
	{
		return mobileservice.saveMobile(mobile_data);
	}
	@GetMapping("/getmethod")
	public List<Mobile_Data> mobileget()
	{
		return mobileservice.findAll(mobiledata);
	}
	@GetMapping("/getid/{id}")
	public Mobile_Data getmobileid(@PathVariable("id") int id)
	{
		return mobileservice.getById(id);
	}
	@DeleteMapping("/deleteid/{id}")
	public String deletemobileid(@PathVariable("id")int id)
	{
		 mobileservice.delete(id);
		 return "success";
	}
	@PutMapping("/update")
	public Mobile_Data updatemobileid(@RequestBody Mobile_Data mobile_data)
	{
		return mobileservice.update(mobile_data);
	}
	
	
	
	

}
