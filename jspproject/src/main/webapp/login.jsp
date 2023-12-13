<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- login page --%>
<%
String name=request.getParameter("name");
String email=request.getParameter("email");
String password=request.getParameter("password");
//PrintWriter out=response.getWriter();
out.println (name);
out.println (email);
out.println (password);
try
{	
	Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Manju587");
     System.out.println(con);
    PreparedStatement pst=con.prepareStatement("insert into jsp1 values(?,?,?)");
	pst.setString(1,name);
	pst.setString(2,email);;
	pst.setString(3,password);
	int i=pst.executeUpdate();
	System.out.println(i);
}
catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}
%>

</body>
</html>