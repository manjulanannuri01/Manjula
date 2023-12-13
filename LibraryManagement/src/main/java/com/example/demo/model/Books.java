package com.example.demo.model;

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
import java.sql.Date;
@Component
@Entity
@Table(name="books")

public class Books {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bookid")
	private int bookid;
	@Column(name="title")
	private String title;
	@Column(name="author")
	private String author;
	@Column(name="cost")
    private double cost;
	@Column(name="date")
	private Date date;
	
	public int getbookid() {
		return bookid;
	}
	public void setbookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
//	 @OneToMany
//	    @JoinColumn(name = "user_id")
//	    private User borrowedBy;
	 
	
}
	
