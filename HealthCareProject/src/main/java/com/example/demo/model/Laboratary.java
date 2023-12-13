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
@Table(name="laboratarydetails")
public class Laboratary {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int laboratary_id;
	private String laboratary_name;
	private String laboratary_bloodtest;
	private String laboratary_denguetest;
	private String laboratary_result;
	private String laboratary_description;
	
	public int getLaboratary_id() {
		return laboratary_id;
	}
	public void setLaboratary_id(int laboratary_id) {
		this.laboratary_id = laboratary_id;
	}
	public String getLaboratary_name() {
		return laboratary_name;
	}
	public void setLaboratary_name(String laboratary_name) {
		this.laboratary_name = laboratary_name;
	}
	public String getLaboratary_bloodtest() {
		return laboratary_bloodtest;
	}
	public void setLaboratary_bloodtest(String laboratary_bloodtest) {
		this.laboratary_bloodtest = laboratary_bloodtest;
	}
	public String getLaboratary_denguetest() {
		return laboratary_denguetest;
	}
	public void setLaboratary_denguetest(String laboratary_denguetest) {
		this.laboratary_denguetest = laboratary_denguetest;
	}
	public String getLaboratary_result() {
		return laboratary_result;
	}
	public void setLaboratary_result(String laboratary_result) {
		this.laboratary_result = laboratary_result;
	}
	public String getLaboratary_description() {
		return laboratary_description;
	}
	public void setLaboratary_description(String laboratary_description) {
		this.laboratary_description = laboratary_description;
	}

	
}
