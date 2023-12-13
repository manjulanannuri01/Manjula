

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc1.servercls;


@WebServlet("/Ser_validate")
public class Ser_validate extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		out.println(email);
		out.println(password);
		servercls s= new servercls();
		List ll=s.validate();
		
		if(ll.contains(email) && ll.contains(password))
		{
	     out.println("scuss");
	     
		}
		else
		{
			
			
			RequestDispatcher rd=req.getRequestDispatcher("ui_validate.html");
			rd.include(req, resp);
			out.println("Invalid");
		}
	}

}
