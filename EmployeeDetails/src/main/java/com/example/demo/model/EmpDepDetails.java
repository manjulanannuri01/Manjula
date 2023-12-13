package com.example.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class EmpDepDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empid")
	private Integer empid;
	
	@Column(name = "emp_name")
	private String emp_name;
	
	@Column(name = "depid")
	private Integer depid;
	
	@Column(name = "dep_name")
	private String dep_name;
	
	@Column(name = "dep_domain")
	private String dep_domain;

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public Integer getDepid() {
		return depid;
	}

	public void setDepid(Integer depid) {
		this.depid = depid;
	}

	public String getDep_name() {
		return dep_name;
	}

	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}

	public String getDep_domain() {
		return dep_domain;
	}

	public void setDep_domain(String dep_domain) {
		this.dep_domain = dep_domain;
	}
	
	

}
