
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ser_view")
public class ser_view extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*String name="";
		String imgurl="C:\\java workspace2\\com.project\\src\\image\\uploadimage\\"+name;	
		resp.setContentType("image/jpeg");
		ServletOutputStream out =resp.getOutputStream();
		//PrintWriter out=resp.getWriter();
		FileInputStream fin=new FileInputStream(imgurl);
		 BufferedInputStream bin = new BufferedInputStream(fin);  
		    BufferedOutputStream bout = new BufferedOutputStream(out);  
		     int ch=0;
		     while((ch=bin.read())!=-1)
		     {
		    	 bout.write(ch);
		     }
		     bin.close();
		     fin.close();
		     bout.close();
		     out.close();
	}	*/
		PrintWriter out=resp.getWriter();
		try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		   Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Manju587");
			System.out.println(con);
			//PrintWriter out=resp.getWriter();
			PreparedStatement pst=con.prepareStatement("select path from image1");
			ResultSet rs=pst.executeQuery(); 
			String path;
		  if(rs.next())
		  {  
         path= rs.getString(1);
         System.out.println(path);
		    resp.setContentType("image/jpg");
		    ServletOutputStream out1 =resp.getOutputStream();
		    FileInputStream fin=new FileInputStream(path);
			 BufferedInputStream bin = new BufferedInputStream(fin);  
			    BufferedOutputStream bout = new BufferedOutputStream(out1);  
			     int ch=0;
			     while((ch=bin.read())!=-1)
			     {
			    	 bout.write(ch);
			     }
			     bin.close();
			     fin.close();
			     bout.close();
			     out1.close();
	}
	}
	catch (Exception e) 
	 {
		  // TODO: handle exception
		  e.printStackTrace();
	 }

}
}
