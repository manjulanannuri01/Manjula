package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Mobile_Data;


public interface Mobile_Service{
	

	public Mobile_Data saveMobile(Mobile_Data mobile_data);
	
	List<Mobile_Data>findAll(Mobile_Data mobiledata);
	public Mobile_Data getById(int id);
   public void delete(int id);
  public Mobile_Data update(Mobile_Data mobile_Data);
  public  void fileupload();
	


}
