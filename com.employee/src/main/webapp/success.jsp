<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>success page</title>
</head>
<body>
<center>
<c:if test="${requestScope.meg!=null }">
<h3><c:out values="${request<Scope.msg}"></c:out></h3>
</c:if><br></br>
<c:if test=${sessionscope.filename!=null}"></c:if>

</center>

</body>
</html>