

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="DownloadServlet",urlPatterns = "/DownloadServlet")
public class DownloadServlet extends HttpServlet {
	public static int BUFFER_SIZE=1024*100;
	public static final String UPLOAD_DIR="resources";
	public static String fileName=null;
	
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
    	fileName = request.getParameter("filename");
    	if(fileName==null || fileName.equals(""))
    	{
    		response.setContentType("text/html");
    		response.getWriter().println("<h3>file"+ fileName+ "is not present</h3>");
    	
    	}
    	else 
    	{
    		String applicationPath=getServletContext().getRealPath("");
			String downloadPath=applicationPath+File.separator+UPLOAD_DIR;
			String filePath=downloadPath+File.separator+fileName;
			System.out.println(fileName);
			System.out.println(filePath);
			System.out.println("filename" +fileName);
			System.out.println("filepath" +filePath);
			File file=new File(filePath);
			OutputStream outstream=null;
			FileInputStream inputstream=null;
			if(file.exists()) {
				String mimetype="application/jpg/pdf";
				response.setContentType(mimetype);
				String headerkey="content-disposition";
				String headerValue=String.format("attachment;filename=\"%s\"",file.getName());
				response.setHeader(headerkey, headerValue);
				try
				{
					outstream=response.getOutputStream();
					inputstream=new FileInputStream(file);
					byte[] buffer=new byte[BUFFER_SIZE];
					int bytesread= -1;
					while((bytesread=inputstream.read(buffer))!=-1) {
						outstream.write(buffer,0,bytesread);
					}
						
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
			}
			
		}
    	
    		
    	
	}

}
