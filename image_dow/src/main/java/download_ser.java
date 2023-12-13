
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/download_ser")
public class download_ser extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		// TODO Auto-generated method stub
	/*	PrintWriter out=resp.getWriter();
		String path="C:\\java workspace2\\image\\src\\main\\webapp\\uploadimage\\";
		String filename="sunflower.jpg";
		resp.setContentType("image/jpeg");
		resp.setContentType("appliacation/octet-stream");
		resp.setHeader("Content-Dispostion","attachment;filename=\""+filename+"\"");
	FileInputStream in=new FileInputStream(path+filename);
	try {
		int i;
		while((i=in.read())!=-1)
		{
			out.write(i);
		
		}
		in.close();
		out.close();
		
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}*/
		String path="C:\\java workspace2\\image\\src\\main\\webapp\\uploadimage\\flower.pdf";
		File downloadfile=new File(path);
		FileInputStream in=new FileInputStream(downloadfile);
		String relativepath=getServletContext().getRealPath("");
		System.out.println(relativepath);
		ServletContext sc=getServletContext();
		String mimeType=sc.getMimeType(path);
		if(mimeType==null)
		{
		mimeType="application/jpg";	
		}
		System.out.println("mime type"+mimeType);
		resp.setContentType(mimeType);
		//resp.setContentLength(int)downloadfile.length();
		String headerKey="Content-Disposition";
		String headerValue=String.format("attachment;filename=\"%s\"", downloadfile.getName());
		resp.setHeader(headerKey, headerValue);
		OutputStream outputstream=resp.getOutputStream();
		byte[] buffer=new byte[4096];
		int bytesRead=-1;
		while((bytesRead=in.read(buffer))!=-1) {
			outputstream.write(buffer, 0, bytesRead);
	}
		in.close();
		outputstream.close();
	}
}
