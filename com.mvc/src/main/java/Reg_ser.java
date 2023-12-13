

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import mvc1.datacls;
import mvc1.servercls;


@WebServlet("/Reg_ser")
public class Reg_ser extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String pnumber=req.getParameter("pnumber");
		String gender=req.getParameter("gender");
	    PrintWriter out=resp.getWriter();
	   out.println(email);
	   out.println(password);
	    datacls d= new datacls();
	    d.setName(name);
	    d.setEmail(email);
	    d.setPassword(password);
	    d.setPnumber(pnumber);
	    d.setGender(gender); 
	   
	    servercls s=new servercls();
	    s.test(d);
	}
	}


