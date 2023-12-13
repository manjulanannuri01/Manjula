package com.example.demo.service;

import java.nio.file.Files;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.FileData;
import com.example.demo.model.File_Data;
import com.example.demo.repository.File_Repository;
@Component
@Service
public  class FileServiceImpl implements FileService {
	
	@Autowired
	File_Repository file_repository;

	@Override
	public FileData saveFileInfo(MultipartFile file) {
		
		//copy
		
		//Files.copy(file.getInputStream(), this.root.resolve(file.getOriginalFilename()));
		
		FileData fileData = new FileData();
		fileData.setFileName("abc.txt");
		fileData.setFileType("txt");
		//file_Data.setPath("file:///C:/Users/UNIFY/Downloads/flower.pdf");
//		file_Data.setFileName(file.getOriginalFilename());
//		file_Data.setFileType(file.getContentType());
//		//file_Data.setPath(file.getPat());
		return file_repository.save( fileData);
	}
	

}
