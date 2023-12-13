package com.example.demo.model;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
@Component
@Entity
@Table(name="department")

public class DepDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "depid")
	private Integer depid;
	
	@Column(name = "dep_name")
	private String dep_name;
	
	@Column(name = "dep_domain")
	private String dep_domain;
	
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

//	public Set<EmpDetails> getEmpDetails() {
//		return empDetails;
//	}
//
//	public void setEmpDetails(Set<EmpDetails> empDetails) {
//		this.empDetails = empDetails;
//	}

	

//	public List<EmpDetails> getEmpdetails() {
//		return empdetails;
//	}
//
//	public void setEmpdetails(List<EmpDetails> empdetails) {
//		this.empdetails = empdetails;
//	}

	//@ManyToMany(targetEntity = EmpDetails.class, cascade = CascadeType.ALL)
//  private List<EmpDetails> empdetails;
//	
//	 @JoinTable(name = "EmpDetails_DepDetails",
//		        joinColumns = {@JoinColumn(name = "emp_id", referencedColumnName = "empid")},
//		        inverseJoinColumns = {@JoinColumn(name = "dep_id", referencedColumnName = "depid")})
//		    private
	
//@JsonIdentityInfo(
//generator = ObjectIdGenerators.PropertyGenerator.class,
//property = "depid")
