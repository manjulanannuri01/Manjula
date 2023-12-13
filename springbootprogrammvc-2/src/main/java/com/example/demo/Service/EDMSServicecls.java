package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EdmsRepository;
import com.example.demo.model.EdmsData;

@Service
public class EDMSServicecls {
	@Autowired
	EdmsData edmsData;
	
	@Autowired
	EdmsRepository edmsRepository;
	
	public EdmsRepository empdetails(EdmsData edmsData)
	{
		this.edmsRepository.save(edmsData);
		return edmsRepository;
	}
	
	

}
