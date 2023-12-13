package com.example.demo.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Component
@Table
@Entity(name="email")
public class EmailDetails {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String toemail;
    private String subject;
    private String message;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getToemail() {
		return toemail;
	}
	public void setToemail(String toemail) {
		this.toemail = toemail;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
