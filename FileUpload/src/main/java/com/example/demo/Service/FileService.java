package com.example.demo.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import javax.lang.model.element.Name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Model.FileData;
import com.example.demo.Repository.FileRepository;

import jakarta.persistence.criteria.Path;


@Service
public class FileService {
	String imagepath="C:\\javaworkspace2\\FileUpload\\src\\main\\imageupload\\";
	@Autowired
	FileRepository filerepository;
	
	//FileData fileData;
	public FileData saveFileInfo(MultipartFile file) throws  IOException {
		String fullpath=imagepath+file.getOriginalFilename();
		FileData fileData = new FileData();
		//Path filepath=Paths.get(path,Name);
		//fileData.setName("abc.txt");
		//fileData.setFiletype("txt");
		//fileData.setPath("file:///C:/Users/UNIFY/Downloads/flower.pdf");
	  fileData.setName(file.getOriginalFilename());
		fileData.setFiletype(file.getContentType());
		fileData.setPath(fullpath);
		file.transferTo(new File(fullpath));
		return filerepository.save( fileData);
	}
	public List<FileData> findall()
	{
		return filerepository.findAll();
	}

}
