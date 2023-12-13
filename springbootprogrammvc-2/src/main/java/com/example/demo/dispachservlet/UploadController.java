package com.example.demo.dispachservlet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class UploadController {
	
	 //private static String UPLOADED_FOLDER = "C:\\javaworkspace2\\springbootprogrammvc-2\\src\\main\\resources";
	
	
	@RequestMapping("/Upload")
	public ModelAndView upload1()
	{
		ModelAndView m1=new ModelAndView("upload1");
		return m1;
	}
	
	@RequestMapping("/fileupload")
	public ModelAndView file1()
	{
		ModelAndView m2= new ModelAndView("files");
		return m2;
		
	}
}
