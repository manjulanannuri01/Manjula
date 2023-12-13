package com.example.demo.model;
import java.util.List;

import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Builder.Default;
@Entity
@Table(name="employee")
@Component
public class EmpDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "empid")
	private Integer empid;
	
	@Column(name = "emp_name")
	private String emp_name;
	
	@Column(name = "depid")
	private int depid;
	
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
	
	public int getDepid() {
		return depid;
	}

	public void setDepid(int depid) {
		this.depid = depid;
	}

//	public List<DepDetails> getDepdetails() {
//		return depdetails;
//	}
//
//	public void setDepdetails(List<DepDetails> depdetails) {
//		this.depdetails = depdetails;
//	}
}

//	public Set<DepDetails> getDepDetails() {
//		return depDetails;
//	}
//
//	public void setDepDetails(Set<DepDetails> depDetails) {
//		this.depDetails = depDetails;
//	}
	


//@OneToOne(fetch = FetchType.LAZY,
//	    cascade =  CascadeType.ALL,
//	    mappedBy = "empDetails")
//@JoinColumn(name = "depid")

// @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "order")
// private Set<OrderItem> orderItems = new HashSet<>();

//@ManyToMany(targetEntity = DepDetails.class,mappedBy = "empdetails",cascade = CascadeType.ALL )
// private List<DepDetails> depdetails;
