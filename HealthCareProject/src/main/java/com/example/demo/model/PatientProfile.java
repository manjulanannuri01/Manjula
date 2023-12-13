package com.example.demo.model;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Component
@Entity
@Table(name="patientdetails")
public class PatientProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="patient_id")
	private String patient_id;
	@Column(name = "patient_firstname")
	private String patient_firstname;
	@Column(name = "patient_lastname")
	private String patient_lastname;
	@Column(name = "patient_email")
	private String patient_email;
	@Column(name = "patient_password")
	private String patient_password;
	@Column(name = "patient_mobileno")
	private Long patient_mobileno;
	@Column(name = "patient_address")
	private String patient_address;
	@Column(name = "patient_aadharno")
	private Long patient_aadharno;
	@Column(name = "patient_doctorname")
	private String patient_doctorname;

	
	public String getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}
	public String getPatient_firstname() {
		return patient_firstname;
	}
	public void setPatient_firstname(String patient_firstname) {
		this.patient_firstname = patient_firstname;
	}
	public String getPatient_lastname() {
		return patient_lastname;
	}
	public void setPatient_lastname(String patient_lastname) {
		this.patient_lastname = patient_lastname;
	}
	public String getPatient_email() {
		return patient_email;
	}
	public void setPatient_email(String patient_email) {
		this.patient_email = patient_email;
	}
	public String getPatient_password() {
		return patient_password;
	}
	public void setPatient_password(String patient_password) {
		this.patient_password = patient_password;
	}
	public Long getPatient_mobileno() {
		return patient_mobileno;
	}
	public void setPatient_mobileno(Long patient_mobileno) {
		this.patient_mobileno = patient_mobileno;
	}
	public String getPatient_address() {
		return patient_address;
	}
	public void setPatient_address(String patient_address) {
		this.patient_address = patient_address;
	}
	public Long getPatient_aadharno() {
		return patient_aadharno;
	}
	public void setPatient_aadharno(Long patient_aadharno) {
		this.patient_aadharno = patient_aadharno;
	}
	public String getPatient_doctorname() {
		return patient_doctorname;
	}
	public void setPatient_doctorname(String patient_doctorname) {
		this.patient_doctorname = patient_doctorname;
	}
	
	}


//@OneToMany(cascade = CascadeType.ALL)
//  @JoinColumn(name = "doctor")
//  @OnDelete(action = OnDeleteAction.CASCADE)
//@Column(insertable=false, updatable=false)
//private List<Doctor> doctor_details;
//
//@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "patient")
//private Set<Doctor> orderItems = new HashSet<>();
//	public List<Doctor> getDoctor_details() {
//		return doctor_details;
//	}
//	public void setDoctor_details(List<Doctor> doctor_details) {
//		this.doctor_details = doctor_details;
//	}
	


