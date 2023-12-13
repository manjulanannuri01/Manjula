

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc3.Datacls;
import com.mvc3.Servicecls;


@WebServlet("/Ser_mvc2")
public class Ser_mvc2 extends HttpServlet {
	   
   
	public void dopost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String gender=req.getParameter("gender");
		
		PrintWriter out=resp.getWriter();
		Datacls d=new Datacls();
		d.setEmail(email);
		d.setPassword(password);
		d.setGender(gender);
		d.testsetter(d);
		Servicecls ss= new Servicecls();
		ss.test(d);
		
		
	}

}
