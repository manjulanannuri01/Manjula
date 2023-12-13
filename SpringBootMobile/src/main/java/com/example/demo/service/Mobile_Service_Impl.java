package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.model.Mobile_Data;
import com.example.demo.repository.File_Repository;
import com.example.demo.repository.Mobile_repository;
@Component
@Service
public  class Mobile_Service_Impl implements Mobile_Service {
	
	@Autowired
		Mobile_repository mobile_repository;
	@Autowired
	File_Repository file_repository;
	
	public Mobile_Data saveMobile(Mobile_Data mobile_data)
    {
        return mobile_repository.save(mobile_data);
    }
	public List<Mobile_Data> findAll(Mobile_Data mobile_Data)
	{
		return mobile_repository.findAll();
		
	}
	public Mobile_Data getById(int id) {
		// TODO Auto-generated method stub
		return mobile_repository.findById(id).get();
		
	}
	
	public void delete(int id) {
		// TODO Auto-generated method stub
		 mobile_repository.deleteById(id);
		
	}
	@Override
	public Mobile_Data update(Mobile_Data mobile_Data) {
		// TODO Auto-generated method stub
		return mobile_repository.save(mobile_Data);
		
	}
	@Override
	public void fileupload() {
		// TODO Auto-generated method stub
		
		
	}
	


}
