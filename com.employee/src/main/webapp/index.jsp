<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<form action=" UploadServlet" method="post" enctype="multipart/form-data">
<table width="400px" align="center" border=2>
<tr>
<td align="center" colspan"2">from detailes</td>
</tr>
<tr>
<td>firstname</td>
<td>
<input type="text" required="" name="firstname"></br></br>
</td>
</tr>
<tr>
<td>lastname</td>
<td>
<input type="text" required="" name="lastname"></br></br>
</td>
</tr>
<tr>
<td>select file</td>
<td>
<input type="file" required="" name="file"></br></br>
</td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="submit"></td>
</tr>
</table>
</form>
<br><a href="file-list.jsp">view list</a>
</center>
</body>
</html>