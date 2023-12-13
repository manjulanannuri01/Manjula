<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
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
<%--update page --%>
<%
String newname=request.getParameter("newname");
String oldname=request.getParameter("oldname");
out.println(newname);
out.println(oldname);


try
{
	Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Manju587");
    System.out.println(con);
    PreparedStatement pst=con.prepareStatement("update jsp1 set name=? where name=?");
   
    pst.setString(1,newname);
    pst.setString(2,oldname);
    
    int i=pst.executeUpdate();
    System.out.println(i);
}
catch(Exception e)
{
	e.printStackTrace();
}

 %>

</body>
</html>