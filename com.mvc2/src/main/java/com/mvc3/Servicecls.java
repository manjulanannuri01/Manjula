package com.mvc3;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class Servicecls 
{
	public void test(Datacls d)
	{
		
		try
		{
			FileInputStream fi=new FileInputStream("C:\\java workspace2\\com.mvc2\\src\\jdbc.properties");	
			Properties p=new Properties();
			p.load(fi);
			Class.forName(p.getProperty("driver")).newInstance();
			Connection con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
			System.out.println(con);
			PreparedStatement p1= con.prepareStatement("insert into manju1 values(?,?,?)");
			p1.setString(1,d.getEmail());
			p1.setString(2,d.getPassword());
			p1.setString(3,d.getGender());
			int i=p1.executeUpdate();
			System.out.println(i);
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}	
}
