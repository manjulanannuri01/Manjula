package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.model.DepDetails;
import com.example.demo.model.EmpDepDetails;
import com.example.demo.model.EmpDetails;
import com.example.demo.repository.DepRepository;
import com.example.demo.repository.EmpRepository;
@Component
@Service
public class empService  {
@Autowired
EmpRepository empRepository;
@Autowired
DepRepository depRepository;

	
	 public void savedetails(EmpDepDetails empdepdetails ) 
	 {
		 EmpDetails empDetails= new EmpDetails();
		 empDetails.setEmpid(empdepdetails.getEmpid());
		 empDetails.setEmp_name(empdepdetails.getEmp_name());
		 empDetails.setDepid(empdepdetails.getDepid());
		 EmpDetails empr =empRepository.save(empDetails);
		
		 DepDetails depDetails2= new DepDetails();
		 depDetails2.setDepid(empdepdetails.getDepid());
		 depDetails2.setDep_name(empdepdetails.getDep_name());
		 depDetails2.setDep_domain(empdepdetails.getDep_domain());
		 DepDetails depr = depRepository.save(depDetails2);
		 
//		DepDetails depr = depRepository.save(empdetails.getDepdetails());
		 System.out.println(empr);
		 System.out.println(depr);
		
	 }
	public List<EmpDepDetails> service()
	{
		List list=new ArrayList<>();
		
		list.add(empRepository.findAll());
		System.out.println(list);
		list.add( depRepository.findAll());
		System.out.println(list.get(1));
		 return list;
	}

	

}
