package com.example.demo.dto;

public class BankDto {
	private int id;
	private int accountno;
	private int aadharno;
	private String name;
	private String email;
	private String password;
	private Long pnumber;
	private String Address;

	
	public BankDto(int id, int accountno, int aadharno, String name, String email, String password, Long pnumber,
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
	public BankDto() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
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
