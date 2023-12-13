package com.example.demo.user;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.stereotype.Component;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Component
@Entity
@Table(name="Airline")
public class User {
		@Id
		//@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private int id;
		@Column(name = "firstname")
		private String firstname;
		@Column(name = "lastname")
		private String lastname;
		@Column(name = "mobilenumber")
		private long mobilenumber;
		@Column(name = "gender")
		private String gender;
		@Column(name = "username")
		private String username;
		@Column(name = "password")
		private String password;
		@Column(name="date")
		private Date date;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public long getMobilenumber() {
			return mobilenumber;
		}
		public void setMobilenumber(long mobilenumber) {
			this.mobilenumber = mobilenumber;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		
		
	

	}



