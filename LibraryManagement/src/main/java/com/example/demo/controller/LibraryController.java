package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Books;

import com.example.demo.model.User;
import com.example.demo.service.LibraryService;

@RestController
public class LibraryController {
	@Autowired
	LibraryService libraryService;
	@PostMapping("libraryuser")
	public User LibraryUser(@RequestBody User user)
	{
	 return	libraryService.userdetails(user);
	}
	
	@GetMapping("getlibrary/{bookid}")
	public ArrayList<Optional> librarydetails(@PathVariable("bookid") int bookid)
	{
		//return 
		 return libraryService.getuserdetails(bookid);
	}
	@PutMapping("/update")
	public User updatedetails(@RequestBody User user)
	{
		return libraryService.update(user);
	}

	@DeleteMapping("/deleteid/{id}")
	public String deleteid(@PathVariable("id")int id)
	{
		 libraryService.delete(id);
		 return "success";
	}
	@PostMapping("librarybook")
	public Books Librarybook(@RequestBody Books book)
	{
	    return libraryService.bookdetails(book);
	}
	
	@GetMapping("getbooks")
	public List<Books> bookdetails()
	{
		return libraryService.getbookdetails();
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id")int id)
	{
		 libraryService.deleteid(id);
		 return "success";
	}
}


