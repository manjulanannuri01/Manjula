package com.example.demo.model;

import org.springframework.stereotype.Controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Controller
@Entity
@Table(name="doctordetails")

public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="doctor_id")
	private int doctor_id;
	@Column(name="doctor_name")
	private String doctor_name;
	@Column(name="doctor_mobileno")
	private Long doctor_mobileno;
	@Column(name="doctor_category")
	private String doctor_category;
	
//	@ManyToOne
//    //Adding the name
//    @JoinColumn(name = "patient")
//	PatientProfile ob;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "id")
   
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public Long getDoctor_mobileno() {
		return doctor_mobileno;
	}
	public void setDoctor_mobileno(Long doctor_mobileno) {
		this.doctor_mobileno = doctor_mobileno;
	}
	public String getDoctor_category() {
		return doctor_category;
	}
	public void setDoctor_category(String doctor_category) {
		this.doctor_category = doctor_category;
	}
	
	
	
}
