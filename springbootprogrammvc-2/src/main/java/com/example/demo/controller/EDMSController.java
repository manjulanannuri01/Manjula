package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.EdmsRepository;
import com.example.demo.Service.EDMSServicecls;
import com.example.demo.model.EdmsData;

@RestController
public class EDMSController {
	
	@Autowired
	EdmsData edmsData;
	
	@Autowired
	EDMSServicecls service;
	
	@RequestMapping("/user")
	public String upload(@RequestParam String email,@RequestParam String password,
			@RequestParam String customerid,@RequestParam String documentname,@RequestParam String asset,
			@RequestParam String documenttype)
	{
		
		this.service.empdetails(edmsData);
		//edmsData.setId(id);
		//edmsData.setEmail(email);
		//edmsData.setPassword(password);
		//edmsData.setCustomerID(customerid);
		//edmsData.setDocumentName(documentname);
		//edmsData.setAsset(asset);
		//edmsData.setDocumentType(documenttype);
		//String filename=File.pathSeparator;
		//d.setFileName(filename);
		//String path ="C:\\javaworkspace2\\springbootprogrammvc-2\\src\\main\\resources\\imgupload"+filename;
		//d.setPath(path);
    //service.empdetails(edmsData);
		return email;
	}
	
	
	
	

}
