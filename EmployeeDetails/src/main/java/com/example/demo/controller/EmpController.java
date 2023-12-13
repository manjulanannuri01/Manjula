package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DepDetails;
import com.example.demo.model.EmpDepDetails;
import com.example.demo.model.EmpDetails;

import com.example.demo.service.empService;
@RestController
public class EmpController {
@Autowired
empService empserviceImpl;
@PostMapping("employeedetails")
	public void savemethod(@RequestBody EmpDepDetails empdepdetails)
	{
	 	empserviceImpl.savedetails(empdepdetails);
	}

@GetMapping("employee")
 	public List<EmpDepDetails> getdetails() 	
	{
	 	return empserviceImpl.service();
	
	
	}
}



