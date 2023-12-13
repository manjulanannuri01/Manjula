package com.jspproject11;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class servercls 
	{
	public void test(datacls d)
	{
		try
		{
			FileInputStream fi=new FileInputStream("C:\\java workspace2\\com.jspproject\\src\\main\\java\\com\\jspproject11\\jdbc.properties");
			
			Properties p=new Properties();
			p.load(fi);
			
			Class.forName(p.getProperty("driver")).newInstance();
			Connection con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
			System.out.println(con);
		
		 PreparedStatement pst=con.prepareStatement("insert into mvcproject values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		 pst.setString(1,d.getTitle());
		 pst.setString(2,d.getFirst_name());
		 pst.setString(3,d.getLast_name());
		 pst.setString(4,d.getPosition());
		 pst.setString(5,d.getCompany());
		 pst.setString(6,d.getBusiness());
		 pst.setString(7,d.getEmployee());
		 pst.setString(8,d.getStree());
		 pst.setString(9,d.getAdditional());
		 pst.setString(10,d.getZip());
		 pst.setString(11,d.getPlace());
		 pst.setString(12,d.getCountry());
		 pst.setString(13,d.getCoad());
		 pst.setString(14,d.getPhone());
		 pst.setString(15,d.getYour_email());

		int i=pst.executeUpdate();
		System.out.println(i);
		
		}//try

catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}
		

	}
}
