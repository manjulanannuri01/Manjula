package com.example.demo.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Component
@Entity
@Table(name="mobile_details2")
public class Mobile_Data {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "ID")
	private Integer id ;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "MOBILE_NAME")
	private String  mobile_name;
	@Column(name = "MOBILE_COST")
	private Integer mobile_cost;
		
	
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getMobile_name() {
			return mobile_name;
		}
		public void setMobile_name(String mobile_name) {
			this.mobile_name = mobile_name;
		}
		public Integer getMobile_cost() {
			return mobile_cost;
		}
		public void setMobile_cost(Integer mobile_cost) {
			this.mobile_cost = mobile_cost;
		}
		
		
		
		
		
		

}
