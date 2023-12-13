import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
@WebServlet("/ser_login")
public class ser_login extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
	    PrintWriter out=resp.getWriter();
	    resp.setContentType("text/html");
	    out.println(email);
	    out.println(password);
	   /* List ll=new ArrayList();
	    if((email) && (password))
	    {
	    	  HttpSession  hs=req.getSession();
	    	   hs.setAttribute("email", email);
	    	   hs.setAttribute("password", password);  
	    	   RequestDispatcher  rd=  req.getRequestDispatcher("ser_login2");
	    	   rd.forward(req, resp);
	    }
	    else
	    {
	    	 out.println("<h3>LOGIN FAIL");
		  	 RequestDispatcher  rd=  req.getRequestDispatcher("login.html");
		  	 rd.include(req, resp);
	    }*/
	    try
	    {
	    	//RowSetFactory rf= RowSetProvider.newFactory();
			//JdbcRowSet jr=rf.createJdbcRowSet();
			
	    	Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			   Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Manju587");
				System.out.println(con);
				PreparedStatement pst=con.prepareStatement("select * from image1 where email=? and password=?");
				pst.setString(1, email);
				pst.setString(2, password);
				ResultSet rs=pst.executeQuery();
				
			if(rs.next())
			{
				 out.println("</br></br>Correct login credentials");
				 RequestDispatcher rs1 = req.getRequestDispatcher("upload.html");
		           rs1.forward(req, resp);
            } 
            else {
                out.println("Incorrect login credentials");
                RequestDispatcher r=req.getRequestDispatcher("login.html");
                r.include(req, resp);
            }
	    }
	    catch (Exception e) {
			// TODO: handle exception
	    	e.printStackTrace();
		}
	}

}
