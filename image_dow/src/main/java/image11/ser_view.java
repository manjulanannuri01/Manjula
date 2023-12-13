package image11;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ser_view")
@MultipartConfig
public class ser_view extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String imgurl="C:\\java workspace2\\image\\src\\main\\webapp\\uploadimage\\flower.jpg";
		//PrintWriter out=resp.getWriter();
		// FileInputStream  fi=new FileInputStream(imgurl);	
		// File   ff=new File("hh.jpg");
		 
		//  FileOutputStream  fo=new FileOutputStream(ff);
		resp.setContentType("image/jpeg");
		ServletOutputStream out =resp.getOutputStream();
		//PrintWriter out=resp.getWriter();
		FileInputStream fin=new FileInputStream(imgurl);
		 BufferedInputStream bin = new BufferedInputStream(fin);  
		    BufferedOutputStream bout = new BufferedOutputStream(out);  
		     int ch=0;
		     while((ch=bin.read())!=-1)
		     {
		    	 bout.write(ch);
		     }
		     bin.close();
		     fin.close();
		     bout.close();
		     out.close();
		    /* for(int in;(in= fi.read())!=-1;in++)
		     {
		    	fo.write(in);   
		     }  
		  		out.println("<html>");
		out.println("<body>");
		
		out.println("<img src=" +ff.getCanonicalPath());
		   //	out.println("<img src=" +ff.getAbsoluteFile()+ ">");
		   	out.println("</body>");
		out.println("</html>");*/
	
		 
	    
		
		
	}	

}
