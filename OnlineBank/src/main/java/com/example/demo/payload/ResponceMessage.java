package com.example.demo.payload;

public class ResponceMessage {
	String message;
	Boolean status;
	public String getmessage() {
		return message;
	}
	public void setmessage(String message)
	{
		this.message=message;
	}
		
	public Boolean getstatus() {
		return status;
	
	}
	public ResponceMessage(String message,Boolean status) {
		
		this.message=message;
		this.status=status;
	}

}
