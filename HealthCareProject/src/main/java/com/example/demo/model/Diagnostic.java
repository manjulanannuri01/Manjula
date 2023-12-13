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
@Table(name="diagnosticdetails")
public class Diagnostic {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="diagnostic_id")
private int diagnostic_id;
@Column(name="diagnostic_name")
private String diagnostic_name;
@Column(name="diagnostic_test")
private String diagnostic_test;
@Column(name="diagnostic_description")
private String diagnostic_description;
public int getDiagnostic_id() {
	return diagnostic_id;
}
public void setDiagnostic_id(int diagnostic_id) {
	this.diagnostic_id = diagnostic_id;
}
public String getDiagnostic_name() {
	return diagnostic_name;
}
public void setDiagnostic_name(String diagnostic_name) {
	this.diagnostic_name = diagnostic_name;
}
public String getDiagnostic_test() {
	return diagnostic_test;
}
public void setDiagnostic_test(String diagnostic_test) {
	this.diagnostic_test = diagnostic_test;
}
public String getDiagnostic_description() {
	return diagnostic_description;
}
public void setDiagnostic_description(String diagnostic_description) {
	this.diagnostic_description = diagnostic_description;
}

}
