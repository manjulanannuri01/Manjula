<%@page import="java.util.List"%>
<%@page import="jsp_mvc1.jsp_servercls"%>
<%@page import="jsp_mvc1.jsp_datacls"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String email=request.getParameter("email");
String password=request.getParameter("password");

jsp_servercls s= new jsp_servercls();
List ll=s.validate();
if(ll.contains(email) && ll.contains(password))
{
 out.println("scuss");
 
}
else
{
	
	out.println("Invalid");
}

%>

</body>
</html>