<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head></head>
<meta charset="UTF-8">
<title>jsp PAGE</title>
<style>
tr,td,th{
padding:20px;
text-align:center;
}
</style>
</head>
<body>
<br><br><br>
<center>
<table border="2">
<tr>

			 
			    <th>email</th>
			    <th>password</th>
			    <th>customerid </th>
			    <th>documentname </th>
			    <th>asset </th>
			    <th>documenttyp</th>
			    <th>imageFileName</th>
			    <th>path</th>
			    <th>add_date</th>
			   <th>download</th>
			   <th>view</th>
</tr>
<%
           Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		   Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Manju587");
			System.out.println(con);
			PreparedStatement pst=con.prepareStatement("select * from image1");
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
            	
%>
          <tr>
          <td><%=rs.getString(1) %></td>
          <td><%=rs.getString(2) %></td>
          <td><%=rs.getString(3) %></td>
          <td><%=rs.getString(4) %></td>
          <td><%=rs.getString(5) %></td>
          <td><%=rs.getString(6) %></td>
          <td><%=rs.getString(7) %></td>
          <td><%=rs.getString(8) %></td>    
          <td><%=rs.getTimestamp(9) %></td>
          <td><a href="ser_download?fileName=<%=rs.getString(7)%>">download</a></td>
          
          </tr>  
          <%
            }
          %>	
</table><br>
</body>
<a href="index.jsp">home</a>
</center>

</body>
</html>