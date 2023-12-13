package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Books;

import com.example.demo.model.User;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.LibraryRepository;


@Service
public class LibraryService {
@Autowired
LibraryRepository libraryRepository;
@Autowired
BookRepository bookRepository;

	public User userdetails(User user) {
		return libraryRepository.save(user);
	}
	
	public ArrayList<Optional> getuserdetails(int bookid) {
		ArrayList<Optional> array= new ArrayList<Optional>();
	
			array.add(libraryRepository.findById(bookid));
			array.add(bookRepository.findById(bookid));
			return array;
	}
	public User update(User user) {
		 return libraryRepository.save(user);
		} 
	
	public void delete(int id) {
		// TODO Auto-generated method stub
		 libraryRepository.deleteById(id);
		
	}
	public Books bookdetails(Books book) {
		return bookRepository.save(book);
	}
	
	public List<Books> getbookdetails() 
	{
	return bookRepository.findAll();
			
	}
	public void deleteid(int id) {
		// TODO Auto-generated method stub
		 bookRepository.deleteById(id);
		
	}

	

}
