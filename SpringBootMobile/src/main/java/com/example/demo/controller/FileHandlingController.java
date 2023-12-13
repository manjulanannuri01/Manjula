package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.service.FileService;

@RestController
public class FileHandlingController {
	@Autowired
	FileService fileService;
	@PostMapping("/fileupload")
	public String fileupload(@RequestParam("file") MultipartFile file)
	{
		String message = "";
		try {
			message = "Uploaded the file successfully: " + file.getOriginalFilename() + "," + file.getContentType();
			 fileService.saveFileInfo(file);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return message;
	}

}
