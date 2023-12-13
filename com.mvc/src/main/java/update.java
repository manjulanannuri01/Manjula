

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/update")
public class update extends HttpServlet {
	
	protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String oldemail=req.getParameter("oldemail");
		String newemail=req.getParameter("newemail");
		PrintWriter out=resp.getWriter();
		out.println(oldemail);
		out.println(newemail);
		
		
	}

}
