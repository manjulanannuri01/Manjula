

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc1.servercls;


@WebServlet("/Ser_feach")
public class Ser_feach extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out =resp.getWriter();
		servercls s=new servercls();
		Vector v=s.test1();
	    Iterator ii = v.iterator();
		while(ii.hasNext())
		{
		
		
	out.println(ii.next());
		}
		//link with db to service class
		
		
	}

}
