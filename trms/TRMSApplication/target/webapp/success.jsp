<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/loginFailed.css" >
<title>Success</title>

</head>
<body>

	<div class="container">
	<% int success = (Integer) session.getAttribute("success");
	if(success > 0){}
	   String message;
	   message = "Thank You! Your Application Was Successfully Submitted";
	%>
	<h1><%= message %></h1>
	<a href="login.html">Logout</a>
	</div>
   

</body>
</html>