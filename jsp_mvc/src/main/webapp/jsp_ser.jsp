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
<%--Registration from --%>
<%
String name=request.getParameter("name");
String email=request.getParameter("email");
String password=request.getParameter("password");
String gender=request.getParameter("gender");
String phoneno=request.getParameter("phoneno");

out.println(name);
out.println(email);
out.println(password);
out.println(gender);
out.println(phoneno);


jsp_datacls d=new jsp_datacls();
d.setName(name);
d.setEmail(email);
d.setPassword(password);
d.setGender(gender);
d.setPhoneno(phoneno);
d.settest();

jsp_servercls s= new jsp_servercls();
s.jsp(d);

%>
<%@page import="oracle.jdbc.dcn.DatabaseChangeListener"%>
</body>
</html>