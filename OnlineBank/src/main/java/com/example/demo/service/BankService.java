package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BankDto;
import com.example.demo.dto.LoginDto;
import com.example.demo.model.BankModel;
import com.example.demo.repository.BankRepository;
@Service
public class BankService {
	@Autowired
	BankRepository repository;
	
	public BankModel saveDetails(BankModel model)
	{
		return repository.save(model);
	}
	public List<BankModel> getMethod() {
		return repository.findAll();
		
	}
	public String loginpage(BankDto login) throws Exception {
		
		Optional<BankModel> recevied_details = repository.findById(login.getAccountno());
		if(recevied_details.isPresent()) {
			 if(recevied_details.get().getPassword().equals(login.getPassword()))
				// HttpStatus("index.html");
				 return "User Able to Login";	
			 else
				 return "Incorrect Password";
		}
			return "No Account Found for this Account Number ";	
	}
	
}
//public LoginDto getById(String name) {
//	
//	 return repository.findbyname(name);
//	
//}
//public String loginpage(BankDto login) throws Exception {
//	
//	Optional<BankModel> recevied_details = repository.findById(login.getAccountno());
//	if(recevied_details.isPresent()) {
//		 if(recevied_details.get().getPassword().equals(login.getPassword())) 
//			 return "User Able to Login";	
//		 else
//			 return "Incorrect Password";
//	}
//		return "No Account Found for this Account Number ";	
//}
	


