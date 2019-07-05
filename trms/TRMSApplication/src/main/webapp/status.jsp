<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Application Status</title>
<link rel="stylesheet" href="css/loginFailed.css" >
</head>
<body>


	<div class="container">
	<% boolean status = Boolean.valueOf(session.getAttribute("status").toString()) ;
	 String message;
	if(status == false){
	  
	   message = "Your application is under process";
	}else{
		message = "Congratulaions! your application has been approved";
	}
	%>
	<h1><%= message %></h1>
	<a href="login.html">Logout</a>
	</div>

</body>
</html>