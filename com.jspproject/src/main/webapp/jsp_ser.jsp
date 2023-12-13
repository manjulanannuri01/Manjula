
<%@page import="com.jspproject11.servercls"%>
<%@page import="com.jspproject11.datacls"%>
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
  String title=request.getParameter("title");
  String first_name=request.getParameter("first_name");
  String last_name=request.getParameter("last_name");
  String position=request.getParameter("position");
  String company=request.getParameter("company");
  String business=request.getParameter("business");
  String employee=request.getParameter("employee");
  String street=request.getParameter("street");
  String additional=request.getParameter("additional");
  String zip=request.getParameter("zip");
  String place=request.getParameter("place");
  String country=request.getParameter("country");
  String coad=request.getParameter("coad");
  String phone=request.getParameter("phone");
  String your_email=request.getParameter("your_email");
  
    out.println(title);
	out.println(first_name);
	out.println(last_name);
	out.println(position);
	out.println(company);
	out.println(business);
	out.println(employee);
	out.println(street);
	out.println(additional);
	out.println(zip);
    out.println(place);
	out.println(coad);
	out.println(country);
	out.println(phone);
	out.println(your_email);	
datacls d=new datacls();
d.setTitle(title);
d.setFirst_name(first_name);
d.setLast_name(last_name);
d.setPosition(position);
d.setCompany(company);
d.setBusiness(business);
d.setEmployee(employee);
 d.setStree(street);
 d.setAdditional(additional);
 d.setZip(zip);
 d.setPlace(place);
 d.setCountry(country);
 d.setCoad(coad);
 d.setPhone(phone);
 d.setYour_email(your_email);
 servercls s= new servercls();
 s.test(d);

%>

</body>
</html>