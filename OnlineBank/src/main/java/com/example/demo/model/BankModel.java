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
@Table(name="bankmodel")
public class BankModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "accountno")
	private Long accountno;
	@Column(name = "aadharno")
	private int aadharno;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "pnumber")
	private Long pnumber;
	@Column(name = "Address")
	private String Address;
	
	
	public BankModel(int id, Long accountno, int aadharno, String name, String email, String password, Long pnumber,
			String address) {
		super();
		this.id = id;
		this.accountno = accountno;
		this.aadharno = aadharno;
		this.name = name;
		this.email = email;
		this.password = password;
		this.pnumber = pnumber;
		Address = address;
	}
	
	
	public BankModel() {
		super();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Long getAccountno() {
		return accountno;
	}
	public void setAccountno(Long accountno) {
		this.accountno = accountno;
	}
	public int getAadharno() {
		return aadharno;
	}
	public void setAadharno(int aadharno) {
		this.aadharno = aadharno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Long getPnumber() {
		return pnumber;
	}
	public void setPnumber(Long pnumber) {
		this.pnumber = pnumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "BankModel [id=" + id + ", accountno=" + accountno + ", aadharno=" + aadharno + ", name=" + name
				+ ", email=" + email + ", password=" + password + ", pnumber=" + pnumber + ", Address=" + Address + "]";
	}
	
	
	
	
	
	
	

}
