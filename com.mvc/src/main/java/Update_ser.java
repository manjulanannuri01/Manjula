

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc1.datacls;
import mvc1.servercls;


@WebServlet("/Update_ser")
public class Update_ser extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String oldemail=req.getParameter("oldemail");
		String newemail=req.getParameter("newemail");
		
		
		PrintWriter out =resp.getWriter();
		datacls d= new datacls();
		
		d.setEmail(oldemail);
		d.setEmail(newemail);
		
		
		servercls ss=new servercls();
		int i=ss.update1(d);
		out.println(i);
		
}
}
