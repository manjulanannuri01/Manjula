import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ser_download")
public class ser_download extends HttpServlet {
	public static int buffer_size=1024*100;
	//public static final String upload_dir="src\\image\\uploadimage";
	public static String filename= null;
	
   /* public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String path="C:\\javaworkspace2\\com.project\\src\\image\\uploadimage";
		PrintWriter out=resp.getWriter();
		File downloadfile=new File(path);
		FileInputStream f=new FileInputStream(downloadfile);
		String relativepath=getServletContext().getRealPath("");
		System.out.println(relativepath);
		ServletContext sc=getServletContext();
		String mimeType=sc.getMimeType(path);
		if(mimeType==null)
		{
		mimeType="application/jpg/pdf";	
		}
		System.out.println("mime type"+mimeType);
	    resp.setContentType(mimeType);
	   // resp.setContentLength(int)downloadfile.length();
	    
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			   Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Manju587");
				System.out.println(con);
				PreparedStatement pst=con.prepareStatement("select imagefilenmae from image1");
				ResultSet r=pst.executeQuery(); 
				while(r.next())
				{
					String filename=r.getString(1);
				}
					System.out.println(filename);
					
					String headerKey="Content-Disposition";
					String headerValue=String.format("attachment;filename=\"%s\"", downloadfile.getName());
					resp.setHeader(headerKey, headerValue);
					FileInputStream in= new FileInputStream(path+filename);
					//OutputStream outputstream=resp.getOutputStream();
					//byte[] buffer=new byte[4096];
					int i;
					while((i=in.read())!=-1)
					{
						out.write(i);
					
					}
				
      
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	}*/
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String path= "C:\\java workspace2\\com.project\\src\\image\\uploadimage\\";
         PrintWriter out=resp.getWriter();
        // File downloadfile=new File(path);
    
        // FileInputStream f=new FileInputStream(downloadFile);
	String relativepath=getServletContext().getRealPath("");
		System.out.println(relativepath);
	ServletContext sc=getServletContext();
		String mimeType = null;
		sc.getMimeType(mimeType);
		if(mimeType==null)
		{
		mimeType="application/jpg/pdf";		
		}
		System.out.println("mime type"+mimeType);
		resp.setContentType(mimeType);
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			   Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Manju587");
				System.out.println(con);
				PreparedStatement pst=con.prepareStatement("select imagefilename from image1  ");
				ResultSet rs=pst.executeQuery(); 
				//String path = null;
				String imgfilename=null;
			  for(;rs.next();)
			  { 
				imgfilename=rs.getString(1);
	            // path= rs.getString(2);
			  
	             String filename=path+imgfilename;
	            
			     System.out.println("p==>"+filename);
			     File downloadFile = new File(filename);
			  
			    String headerKey="Content-Disposition";
				//String headerValue=("attachment;filename=\""+"filenames"+"\"");
				String headerValue=String.format("attachment;filename=\"%s\"", downloadFile.getName());
				resp.setHeader(headerKey, headerValue);
		}
				FileInputStream in=new FileInputStream(filename);
				int i;
				while((i=in.read())!=-1)
				{
					out.write(i);
				
				}
			  
		}    
			   catch (Exception e2) {
				// TODO: handle exception
				   e2.printStackTrace();
			   }
			
		}
		
	}


		
		
		
		


		

	 
	  


