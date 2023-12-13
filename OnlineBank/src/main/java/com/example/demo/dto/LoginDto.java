package com.example.demo.dto;

public class LoginDto {
	private int accountno;
	private String password;
	
	public LoginDto(int accountno, String password) {
		super();
		this.accountno = accountno;
		this.password = password;
	}

	public LoginDto() {
		super();
	}

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginDto [accountno=" + accountno + ", password=" + password + "]";
	}
		

}
