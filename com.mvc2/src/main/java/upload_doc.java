

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@WebServlet("/upload_doc")
@MultipartConfig  
public class upload_doc extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		  String path = req.getParameter("destination");  
	      Part filePart = req.getPart("fil");  
	      String fileName = getFileName(filePart); 
	     OutputStream otpStream = null;  
	        InputStream iptStream = null;  
	         PrintWriter writer = resp.getWriter();  
	          
	     
			try { 
				Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
				   Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Manju587");
					
					System.out.println(con);
					
	            otpStream = new FileOutputStream(new File(path + File.separator + fileName));  
	            iptStream = filePart.getInputStream();  
	  
	            int read = 0;   
	            byte[] bytes = new byte[1024];   
	            while ((read = iptStream.read(bytes)) != -1) {  
	                otpStream.write(bytes, 0, read);  
	            }  
	            writer.println("New file " + fileName + " created at " + path); 
	            PreparedStatement psp=con.prepareStatement("insert into upload values(?,?)");
			
		       
			   String part = null;
			FileInputStream in= new FileInputStream(part);
				
				
				
				psp.setBlob(1, in);
	            psp.executeUpdate();
	        }  
	        
	        catch (Exception e){ 
	        	e.printStackTrace();
	          //  writer.println("You either did not specify a file to upload or are trying to upload a file to a protected or nonexistent location.");  
	          //  writer.println("<br/> ERROR: " + fne.getMessage());  
	             
	        }
	     
	}
	   private String getFileName(final Part part) {  
	        final String partHeader = part.getHeader("content-disposition");  
	        for (String content : part.getHeader("content-disposition").split(";")) {  
	            if (content.trim().startsWith("filename")) {  
	                return content.substring(content.indexOf('=') + 1).trim().replace("\"", "");  
	            }  
	        }  
	         
	        return null; 
	    }  
	    }



	
	


