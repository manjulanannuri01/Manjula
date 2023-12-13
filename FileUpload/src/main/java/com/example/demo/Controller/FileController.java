package com.example.demo.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Model.FileData;
import com.example.demo.Service.FileService;
import com.fasterxml.jackson.core.sym.Name;
@RestController
public class FileController {
	@Autowired
	FileService fileService;
	@Autowired
	FileData fileData;
	
	@PostMapping("/fileupload")
	public void fileupload(@RequestParam("file") MultipartFile file) throws IOException
	{
		
		/*String message = "";
	 try {
			message = "Uploaded the file successfully: " + file.getOriginalFilename() + "," + file.getContentType();
			//path="C:\\javaworkspace2\\FileUpload\\src\\main\\imageupload\\"+ file.getOriginalFilename();
			 fileService.saveFileInfo(file);
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		fileService.saveFileInfo(file);
	}
	@GetMapping("/getfiledetails")
		public List<FileData> getfile()
		{
		return fileService.findall();
		}
	


}
