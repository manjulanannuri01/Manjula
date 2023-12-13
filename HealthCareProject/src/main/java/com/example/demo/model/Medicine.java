package com.example.demo.model;

import org.springframework.stereotype.Controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Controller
@Entity
@Table(name="medicinedetails")
public class Medicine {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="medicine_id")
		private int medicine_id;
		@Column(name="medicine_name")
		private String medicine_name;
		@Column(name="medicine_type")
		private String medicine_type;
		@Column(name="medicine_description")
		private String medicine_description;
		@Column(name="medicine_company")
		private String medicine_company;
		@Column(name="medicine_cost")
		private Long medicine_cost;
	
		public int getMedicine_id() {
			return medicine_id;
		}
		public void setMedicine_id(int medicine_id) {
			this.medicine_id = medicine_id;
		}
		public String getMedicine_name() {
			return medicine_name;
		}
		public void setMedicine_name(String medicine_name) {
			this.medicine_name = medicine_name;
		}
		public String getMedicine_type() {
			return medicine_type;
		}
		public void setMedicine_type(String medicine_type) {
			this.medicine_type = medicine_type;
		}
		public String getMedicine_description() {
			return medicine_description;
		}
		public void setMedicine_description(String medicine_description) {
			this.medicine_description = medicine_description;
		}
		public String getMedicine_company() {
			return medicine_company;
		}
		public void setMedicine_company(String medicine_company) {
			this.medicine_company = medicine_company;
		}
		public Long getMedicine_cost() {
			return medicine_cost;
		}
		public void setMedicine_cost(Long medicine_cost) {
			this.medicine_cost = medicine_cost;
		}
	
			
}
