<%@page import="jsp_mvc1.jsp_servercls"%>
<%@page import="jsp_mvc1.jsp_datacls"%>
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

jsp_datacls d=new jsp_datacls();
d.setNewname(newname);
d.setOldname(oldname);
jsp_servercls s=new jsp_servercls();
s.update(d);


 %>


</body>
</html>