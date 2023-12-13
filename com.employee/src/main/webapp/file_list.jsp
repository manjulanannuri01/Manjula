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
<th>firstname</th>
<th>lastname</th>
<th>filename</th>
<th>filepath</th>
<th>added_date</th>
<th>download</th>
</tr>
<%
           Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		   Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Manju587");
			System.out.println(con);
			PreparedStatement pst=con.prepareStatement("select * from employee");
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
            	
%>
          <tr>
          <td><%=rs.getString(1) %></td>
          <td><%=rs.getString(2) %></td>
          <td><%=rs.getString(3) %></td>
          <td><%=rs.getString(4) %></td>
          <td><%=rs.getTimestamp(5) %></td>
          <td><a href="DownloadServlet?fileName=<%=rs.getString(3)%>">download</a></td>
          
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