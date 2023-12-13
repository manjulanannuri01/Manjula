

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;


@WebServlet(name="UploadServlet", urlPatterns ="/UploadServlet")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 10,
maxFileSize= 1024 * 1024 * 1000,
maxRequestSize=1024 * 1024 * 1000)

public class UploadServlet extends HttpServlet {
	PrintWriter out=null;
	Connection con=null;
	PreparedStatement ps=null;
	HttpSession session=null;
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/plain; charset=UTF-8");
		try
		{
			//String resources="C:\\javaworkspace2\\com.employee\\src\\resources";
			out=response.getWriter();
			session=request.getSession(false);
			String folderName="resources";
			String uploadPath= request.getServletContext().getRealPath("C:\\\\javaworkspace2\\\\com.employee\\\\src\\")+folderName;
			File dir=new File(uploadPath);
			if(!dir.exists()) {
				dir.mkdirs();
			}
			Part filePart = request.getPart("file");
			String firstName=request.getParameter("firstname");
			String lastName=request.getParameter("lastname");
			String fileName= filePart.getSubmittedFileName();
			String path=folderName + File.separator +fileName;
			Timestamp added_date=new Timestamp(System.currentTimeMillis());
			System.out.println("filename:"+fileName);
			System.out.println("path:"+uploadPath);
			System.out.println("name:"+firstName);
			InputStream is=filePart.getInputStream();
			
			Files.copy(is,Paths.get(uploadPath + File.separator + fileName),StandardCopyOption.REPLACE_EXISTING);
		     try
		     {
		    	 Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
				   Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Manju587");
					System.out.println(con);
					PreparedStatement pst=con.prepareStatement("insert into employee(firstname,lastname,filenmae,path,added_date) values (?,?,?,?,?)");
		            pst.setString(1,firstName);
		            pst.setString(2,lastName);
		            pst.setString(3, fileName);
		            pst.setString(4, path);
		            pst.setTimestamp(5, added_date);
		            int status=pst.executeUpdate();
		          /*  if(status>0) {
		            	session.setAttribute("filename", fileName);
		            	String msg=""+fileName+"file uploaded successfully";
		            	request.setAttribute("msg",msg);
		            	RequestDispatcher rd=request.getRequestDispatcher("/success.jsp");
		                rd.forward(request, response);
		                System.out.println("file uploaded successfully");
		                System.out.println("uploaded path"+uploadPath);
		                 }*/
		     }
		     catch (Exception e) {
				// TODO: handle exception
		    	 e.printStackTrace();
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
