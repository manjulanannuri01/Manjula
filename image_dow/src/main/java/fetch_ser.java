

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
	
	private Object href;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		// TODO Auto-generated method stub
		PrintWriter out=resp.getWriter();
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			   Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Manju587");
				System.out.println(con);
				PreparedStatement pst=con.prepareStatement("select * from image");
				ResultSet rs=pst.executeQuery();
				
				out.println("<table width=50% border=2>");
			    out.println("<tr>");
			    out.println("<td>filename</td>");
			    out.println("<td>path</td>");
			    out.println("<td>add_date</td>");
			    out.println("<td>download</td>");
			   
                

			    out.println("</tr>");
			    
			    while(rs.next())
			    {
			    	 out.println("<tr>");
			    	out.println("<td>"+rs.getString(1)+"</td>");
			    	out.println("<td>"+rs.getString(2)+"</td>");
			    	out.println("<td>"+rs.getTime(3)+"</td>");
					out.println("<td>" <a href"=download_ser?fileName= rs.getString(1)">download</a>"</td>");
			    	 out.println("</tr>");
			    }
			    out.println("<table >");
			    
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
