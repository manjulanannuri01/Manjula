package jsp_mvc1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Vector;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import oracle.net.aso.d;

public class jsp_servercls {
	
	public void jsp(jsp_datacls d)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Manju587");
		     System.out.println(con);
		
		 PreparedStatement pst=con.prepareStatement("insert into jsp values(?,?,?,?,?)");
		 pst.setString(1,d.getName());
		 pst.setString(2,d.getEmail());
		 pst.setString(3,d.getPassword());
		 pst.setString(4,d.getGender());
		 pst.setString(5,d.getPhoneno());
		int i=pst.executeUpdate();
		System.out.println(i);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void update(jsp_datacls d) {
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Manju587");
		    System.out.println(con);
		    PreparedStatement pst=con.prepareStatement("update jsp set name=? where name=?");
		   
		    pst.setString(1,d.getNewname());
		    pst.setString(2,d.getOldname());
		    
		    int i=pst.executeUpdate();
		 System.out.println(i);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	Vector v;
	public Vector feach() 
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Manju587");
	    System.out.println(con);
	    PreparedStatement pst=con.prepareStatement("select * from jsp");
	    ResultSet rs=pst.executeQuery();
		jsp_datacls d=new jsp_datacls();
		v=new Vector();
		while(rs.next())
		{
			String a=rs.getString(1);
			String b=rs.getString(2);
			String c=rs.getString(3);
			String d1=rs.getString(4);
			String e=rs.getString(5);
			
			v.add(a);
			v.add(b);
			v.add(c);
			v.add(d1);
			v.add(e);
			System.out.println(v);
		}
			}
		
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return v;
	}
	
	public void validate()
	{
		List ll=new ArrayList();
		try
		{
			RowSetFactory rf= RowSetProvider.newFactory();
			JdbcRowSet jr=rf.createJdbcRowSet();
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			jr.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			jr.setUsername("system");
			jr.setPassword("Manju587");
			
			jr.setCommand("select email,password from jsp");
			jr.execute();
			for(;jr.next();)
			{
				
				ll.add(jr.getString("email"));
				ll.add(jr.getString("password"));
			}
		  
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
}


	


