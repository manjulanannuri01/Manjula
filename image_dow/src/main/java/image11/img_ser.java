package image11;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
@MultipartConfig
@WebServlet("/img_ser")
public class img_ser extends HttpServlet {
	private static final String save_dir="photo";
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Part part=request.getPart("image");
       String filename=part.getSubmittedFileName();
		String savepath ="C:\\java workspace2\\image\\src\\main\\webapp\\uploadimage" +File.separator + save_dir;
		File filesavedir =new  File(savepath);
		Timestamp add_date= new Timestamp(System.currentTimeMillis());
		try {
	 System.out.println("selected image file name"+ filename);
	  String uploadPath= savepath + filename;
     System.out.println("upload path :"+uploadPath);
     
      FileOutputStream fi=new FileOutputStream(uploadPath);
      InputStream is=part.getInputStream();
      byte[] data=new byte[is.available()];
      is.read(data);
      fi.write(data);
      fi.close();   
			
      Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Manju587");
      PreparedStatement pst=con.prepareStatement("insert into image  values(?,?,?,?)");
      pst.setString(1,filename );
      String path= savepath + File.separator +filename;
      pst.setString(2,path); 
	pst.setTimestamp(3, add_date);
	String download=null;
	pst.setString(4, download);
    int r = pst.executeUpdate();
    if(r>0){
    	System.out.println("Uploaded successfully !");
    	}
    	else{
        System.out.println("Error!");
    	}
      }
      catch (Exception e) {
		// TODO: handle exception
    	  e.printStackTrace();
	  }
	}  
    }
      
  





















