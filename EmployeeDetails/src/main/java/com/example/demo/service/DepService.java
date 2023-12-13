package com.example.demo.service;

import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.DepDetails;
import com.example.demo.model.EmpDetails;
import com.example.demo.repository.DepRepository;
import com.example.demo.repository.EmpRepository;

import jakarta.transaction.Transactional;
//@Service
//public class DepService {
//	@Autowired
//	DepRepository depRepository;
//	@Autowired
//	EmpRepository empRepository;
//	@Transactional
//	public DepDetails depsave(DepDetails depDetails)
//	{
//		DepDetails depDetails2= new DepDetails();
//		depDetails2.setDepid(depDetails.getDepid());
//		depDetails2.setDep_name(depDetails.getDep_name());
//		depDetails2.setDep_domain(depDetails.getDep_domain());
//		empRepository.saveAll(depDetails.getEmpdetails());
//		return depRepository.save(depDetails);
//	}

		/*List<DepDetails> depList = new ArrayList<>();
		depList.add(depDetails2);
		for(int i=0; i<depDetails .getEmpdetails().size(); i++)
		{
				if(!EmpRepository.findByemp_name(depDetails.getEmpdetails().get(i).getEmp_name()).isPresent()) 
				{
					EmpDetails newemp = depDetails.getEmpdetails().get(i);
	                newemp.setDepdetails(depList);
	                EmpDetails savedemp = empRepository.save(newemp);
	                //EmpDetails emp = new EmpDetails();
	                //emp.setid(emp.getid());
	               // emp.setEmp_name(emp.getEmp_name());
	             if(! empRepository.findById(savedemp.getid()).isPresent()) 
                   return ("depdetails Creation Failed");
				}
	             else  return ("User with email Id is already Present");
		        }*/
		        
//	}
//	}

