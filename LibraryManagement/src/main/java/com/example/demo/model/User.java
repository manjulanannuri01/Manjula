package com.example.demo.model;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="user")
public class User {
	
	//@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="phoneno")
	private Long phoneno;
	@Column(name="address")
	private String address;
	@Id
	@Column(name="bookid")
	private int bookid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	
	
	
	
}
	
//	@Column(name="book_id")
//	private int book_id;
   // private User borrowedBy; 
//	@ManyToOne
//    @JoinColumn(name = "book_id")	
	


