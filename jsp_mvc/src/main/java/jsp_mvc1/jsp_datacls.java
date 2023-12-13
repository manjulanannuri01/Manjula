package jsp_mvc1;

import java.io.PrintStream;

public class jsp_datacls {
	private String name;
	private String email;
	private String password;
	private String gender;
	private String phoneno;
	
	private String newname;
	private String oldname;
	
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getNewname() {
		return newname;
	}
	public void setNewname(String newname) {
		this.newname = newname;
	}
	public String getOldname() {
		return oldname;
	}
	public void setOldname(String oldname) {
		this.oldname = oldname;
	}
	public void settest()
	{
		System.out.println(name);
		
		System.out.println(email);
		System.out.println(password);
		System.out.println(gender);
		System.out.println(phoneno);
		
	}
	

}
