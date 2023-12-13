
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/fetch_ser")
public class fetch_ser extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		//String imgurl="C:\\java workspace2\\image\\src\\main\\webapp\\uploadimage\\flower.jpg";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			   Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Manju587");
				System.out.println(con);
				PreparedStatement pst=con.prepareStatement("select * from image1");
				ResultSet rs=pst.executeQuery();
				out.println("<table width=50% border=2>");
			    out.println("<tr>");
			    out.println("<td>email</td>");
			    out.println("<td>password</td>");
			    out.println("<td>customerid </td>");
			    out.println("<td> documentname </td>");
			    out.println("<td> asset </td>");
			    out.println("<td> documenttyp</td>");
			    out.println("<td> imageFileName</td>");
			    out.println("<td> path</td>");
			    out.println("<td>add_date</td>");
			    out.println("<td>download</td>");
			    out.println("<td>view</td>");
			    out.println ("</tr>");
				while(rs.next())
				{
					//String filePath = rs.getString(8);
					out.println("<tr>"); 
					out.println("<td>"+rs.getString(1)+"</td>");
					out.println("<td>"+rs.getString(2)+"</td>");
			    	 out.println("<td>"+ rs.getString(3)+"</td>");
			    	  out.println("<td>"+ rs.getString(4)+"</td>");
			    	  out.println("<td>"+rs.getString(5)+"</td>");
			    	  out.println("<td>"+rs.getString(6)+"</td>");
			    	  out.println("<td>"+rs.getString(7)+"</td>");
			    	  out.println("<td>"+rs.getString(8)+"</td>");
			    	  out.println("<td>"+rs.getTime(9)+"</td>");
//				out.println("<td>"+"<a href=\"ser_download?imagefilename\">download</a>"+"</td>");
			    	 
				//out.println("<td>"+"<a href="+filePath+">download</a>"+"</td>");

				 out.println("<td>"+"<a href=\"ser_download\">download</a>"+"</td>");
				 
				 
				 //out.println("<td>"+"<a href=\"ser_view\">view</a>"+"</td>");
		    	  out.println("</tr>");
				}
				out.println("</table>");
				/*resp.setContentType("image/jpeg");
				ServletOutputStream out1 =resp.getOutputStream();
				
				FileInputStream fin=new FileInputStream(imgurl);
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
				     out.close();*/
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

}
