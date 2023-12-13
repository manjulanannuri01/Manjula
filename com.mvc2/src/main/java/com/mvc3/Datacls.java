package com.mvc3;

public class Datacls {
	
	private String email;
	private String password;
	private String gender;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void testsetter(Datacls d)
	{
		System.out.println(email);
		System.out.println(password);
		System.out.println(gender);
	}

}
