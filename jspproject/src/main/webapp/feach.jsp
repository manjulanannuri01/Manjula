<%@page import="java.util.Vector"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="javax.naming.spi.DirStateFactory.Result"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--fech page --%>
<%


try
{	
	Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Manju587");
     System.out.println(con);
    PreparedStatement pst=con.prepareStatement("select * from jsp");
    ResultSet r=pst.executeQuery();
    out.println("<table width=50% border=2>");
    out.println("<tr>");
    out.println("<td>name </td>");
    out.println("<td> email </td>");
    out.println("<td>password </td>");
    out.println ("</tr>");
  	
     while(r.next())
     {
    	out.println("<tr>"); 
    	 out.println("<td>"+ r.getString(1)+"</td>");
    	  out.println("<td>"+ r.getString(2)+"</td>");
    	  out.println("<td>"+ r.getString(3)+"</td>");
    	  out.println("</tr>");
     }
     
     out.println("</table>");
}

catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
	
}

%>

</body>
</html>