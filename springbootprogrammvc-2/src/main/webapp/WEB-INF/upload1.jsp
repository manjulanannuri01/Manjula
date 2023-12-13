<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>

body {
  background-color:pink;
 
}
</style>
<title>UPLOAD DOCUMENT</title>
</head>
<body>
<style>
    form{
    
       width:400px;
       height:500px;
       border: solid;
       border-color: green;
    }
 </style>
<center>
<form action="/EDMSController" method="post" enctype="multipart/form-data">
<h5><b>UPLOAD DOCUMENT</b></h5>

Email           <input type="text" name="email"></br></br>
Password        <input type="password" name="password"></br></br>
Customer ID     <input type="text"name="customerID"></br></br>
Documentname<select name="documentName" >
                <option>none</option>
                <option> pan card</option>
                <option>aadhar card</option>    
         		<option>passphot</option>
         		<option> driving licence</option>
       		    <option>voter Id</option>
                </select></br></br>
Asset<select name="asset">
                <option>none</option>
        		<option> house loan</option>
         		<option>car loan</option>
         		<option>gold loan</option>
        		<option>study loan</option>
         		</select></br></br>
   Document Type   <input type="text" name="documentType"></br></br>
  
 			<input type="submit" value="click"> </br></br>
</form>
</center>
</body>
</html>