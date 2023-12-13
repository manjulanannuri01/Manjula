import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/ser_login2")
public class ser_login2 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 HttpSession  hs=  req.getSession(false);
    	 PrintWriter out=  resp.getWriter(); 
    	   if(hs !=null)
    	   {
    	 
    		   String email=(String)   hs.getAttribute("email");
  	    	 String password=  (String) hs.getAttribute("password");
  	    	
			out.println("session data are :"+email);
			out.println("session data are :"+password);
			
	      }
	}
}


