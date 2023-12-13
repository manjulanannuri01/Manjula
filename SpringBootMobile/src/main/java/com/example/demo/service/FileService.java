package com.example.demo.service;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.FileData;
import com.example.demo.model.File_Data;


public interface FileService{
	

	public FileData saveFileInfo(MultipartFile file);
	
//	List<Mobile_Data>findAll(Mobile_Data mobiledata);
//	public Mobile_Data getById(int id);
//   public void delete(int id);
//  public Mobile_Data update(Mobile_Data mobile_Data);
//  public  void fileupload();
	


}
