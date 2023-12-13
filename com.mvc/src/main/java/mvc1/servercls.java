package mvc1;

import java.beans.Statement;
import java.io.FileInputStream;
import java.io.PrintWriter;
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

public class servercls 
{
		
		
			public void test(datacls d)
			{
				try
				{
					FileInputStream fi=new FileInputStream("C:\\java workspace2\\com.mvc\\src\\main\\java\\mvc1\\jdbc.properties");
					
					Properties p=new Properties();
					p.load(fi);
					
					Class.forName(p.getProperty("driver")).newInstance();
					Connection con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
					System.out.println(con);
				
				 PreparedStatement pst=con.prepareStatement("insert into mvcproject values(?,?,?,?,?)");
				 pst.setString(1,d.getName());
				 pst.setString(2,d.getEmail());
				 pst.setString(3,d.getPassword());
				 pst.setString(4,d.getPnumber());
				 pst.setString(5,d.getGender());
				int i=pst.executeUpdate();
				System.out.println(i);
				
				}//try
		
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
				
	
		}//method
			
			public List validate()
			{
			List ll= new ArrayList();
			
				try
				{
					RowSetFactory rf= RowSetProvider.newFactory();
					JdbcRowSet jr=rf.createJdbcRowSet();
					Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
					jr.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
					jr.setUsername("system");
					jr.setPassword("Manju587");
					
					jr.setCommand("select email,password from mvcproject");
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
				return ll;
			}
			
			Vector v;

			public Vector test1()
			{

				try
				{
					FileInputStream fi=new FileInputStream("C:\\java workspace2\\com.mvc\\src\\main\\java\\mvc1\\jdbc.properties");
				
					Properties p=new Properties();
					p.load(fi);
					
				Class.forName(p.getProperty("driver")).newInstance();
				Connection con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
				
				System.out.println(con);
				
				String str="select * from mvcproject";
				PreparedStatement pst=con.prepareStatement(str);
				ResultSet rs=pst.executeQuery();
				datacls d=new datacls();
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
			public int update1(datacls d)
			{
				int res = 0;
				try
				{

					FileInputStream fi=new FileInputStream("C:\\java workspace2\\com.mvc\\src\\main\\java\\mvc1\\jdbc.properties");
					
					Properties p=new Properties();
					p.load(fi);
					
					Class.forName(p.getProperty("driver")).newInstance();
					Connection con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
					System.out.println(con);
				
				 PreparedStatement pst=con.prepareStatement("update mvcproject set email=? where email=?");
			
				 pst.setString(1,d.getEmail());
				 pst.setString(2,d.getEmail());
				int i=pst.executeUpdate();
				res=i;
				
				}
				catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				return res;
				
			}
			
	
			
}		
			