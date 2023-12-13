
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
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/dow_ser")
public class dow_ser extends HttpServlet {
	public static String filename=null;
	public static final String upload_dir="resources";
	private static final int BUFFER_SIZE = 0;
	private ServletOutputStream OutputStream;
	private FileInputStream InputStream;
	private int filePath;
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String filePath="C:\\java workspace2\\image\\src\\main\\webapp\\uploadimage\\";
		PrintWriter out=resp.getWriter();
		
		String Name="sunflower.jpg";
		/*String filename=req.getParameter("imageFileName");
	
		if(filename==null || filename.equals(""))
		{
		resp.setContentType("image/jpeg");
		resp.getWriter().println("<h3>file"+ filename +"</h3>");
	     }
		else
		{
			String applicationpath =getServletContext().getRealPath("");
			String downloadpath= applicationpath + File.separator +upload_dir;
			String filepath=downloadpath +File.separator +filename;
			System.out.println(filename);
			System.out.println(filepath);
			
			FileInputStream i=null;/*
			System.out.println("filename:"+filename);
			System.out.println("filepath"+filepath);
			File f=new File(filepath);
			if(f.exists()) {
				String mimeType="application/octet_stream";
				resp.setContentType(mimeType);
			resp.setHeader("Content-Dispostion","attachment;filename=\""+f.getName()+"\"");
			}
			try
			{
			 OutputStream  = resp.getOutputStream();
			 InputStream =new FileInputStream(f);
			 byte[] buffer =new byte[BUFFER_SIZE];
		     int bytesRead=-1;
		     while((bytesRead=i.read(buffer))!=-1)
		     {
		    	 OutputStream.write(buffer, 0, bytesRead);
		     }
			
		
		}	
		
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
	//	PrintWriter out=resp.getWriter();
	
		//String path="C:\\java workspace2\\image\\src\\main\\webapp\\uploadimage\\";
		resp.setContentType("image/jpeg");
		resp.setContentType("appliacation/octet-stream");
		resp.setHeader("Content-Dispostion","attachment;filename=\""+Name+"\"");
	FileInputStream in=new FileInputStream(filePath+Name);
	try {
		int i;
		while((i=in.read())!=-1)
		{
			out.write(i);
		
		}
		in.close();
		out.close();
		
		}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		/* public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 FileInputStream fileInputStream = null;
		byte[] bytesArray = null;
		try {

			
			boolean check = new File( filePath + fileName).exists();
			if (!check)
				throw new Exception("File not Found");

			final File file = new File(filePath + fileName);
			if (file != null) {
				resp.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
			}
			bytesArray = new byte[(int) file.length()];
			fileInputStream = new FileInputStream(file);
			fileInputStream.read(bytesArray);
	       }
		
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} */
	
	}
		}
/*public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String path= "C:\\java workspace2\\com.project\\src\\image\\uploadimage\\";
         PrintWriter out=resp.getWriter();
         File downloadfile=new File(path);
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
				PreparedStatement pst=con.prepareStatement("select imagefilenmae from image1  ");
				ResultSet rs=pst.executeQuery(); 
				//String path = null;
				String imgfilename=null;
			  for(;rs.next();)
			  { 
				imgfilename=rs.getString(1);
	            // path= rs.getString(2);
			  
	             String filename=path+imgfilename;
	             File downloadFile = new File(filename);
			     System.out.println("p==>"+filename);

			    String headerKey="Content-Disposition";
				//String headerValue=String.format("attachment;filename=\""+"path"+"\"");
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
		
	}*/

		