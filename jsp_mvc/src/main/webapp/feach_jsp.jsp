<%@page import="java.util.Iterator"%>
<%@page import="java.util.Vector"%>
<%@page import="jsp_mvc1.jsp_servercls"%>
<%@page import="java.io.PrintWriter"%>
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

jsp_servercls s= new jsp_servercls();
Vector v =s.feach();
Iterator ii = v.iterator();
while(ii.hasNext())
{


out.println(ii.next());
}

%>

</body>
</html>