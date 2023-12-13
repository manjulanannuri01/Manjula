import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet(name = " ser_upload ", urlPatterns ="/ser_upload")
@MultipartConfig
public class ser_upload extends HttpServlet{
	private static final String save_dir="uploadimage";
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    String email= req.getParameter("email");
	    String password=req.getParameter("password");
		String customerid = req.getParameter("customerid");
	    String documentname	=req.getParameter("documentname");
		String asset=req.getParameter("asset");
		String documenttype =req.getParameter("documenttype");
		Part file=req.getPart("image");
		String imageFileName=file.getSubmittedFileName();
		String savepath ="C:\\javaworkspace2\\com.project\\src\\image" +File.separator + save_dir;
		File filesavedir =new  File(savepath);
		Timestamp add_date = new Timestamp(System.currentTimeMillis());
		System.out.println("selected image file name"+ imageFileName);
	  String uploadPath="C:\\javaworkspace2\\com.project\\src\\image\\uploadimage\\" + imageFileName;
      System.out.println("upload path :"+uploadPath);
      try
      {
      FileOutputStream fi=new FileOutputStream(uploadPath);
      InputStream is=file.getInputStream();
      byte[] data=new byte[is.available()];
      is.read(data);
      fi.write(data);
      fi.close();
      }
      catch (Exception e) {
		// TODO: handle exception
    	  e.printStackTrace();
	}
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		   Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Manju587");
			System.out.println(con);
			PreparedStatement pst=con.prepareStatement("insert into image1 values(?,?,?,?,?,?,?,?,?)");
			pst.setString(1, email);
			pst.setString(2, password);
		   pst.setString(3, customerid);
		   pst.setString(4, documentname);
		   pst.setString(5,asset );
		   pst.setString(6,documenttype);
		   pst.setString(7,imageFileName );
		   String path= savepath + File.separator +imageFileName;
		   pst.setString(8, path);
		   pst.setTimestamp(9,add_date);
	    	 int row= pst.executeUpdate();
	    	 System.out.println(row);
	    	/* if(row>0)
	    	 {
	    		 System.out.println("image added into database successflly");
	    	 }
	    	 else
	    	 {
	    		 System.out.println("failed to upload image");
	    	 }*/
	    	  
		   
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	     }
	}



		


