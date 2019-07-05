<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
  <html>
    <head>
      <!--Import Google Icon Font-->
      <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <!--Import materialize.css-->
      <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
      <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
      
      <link rel="stylesheet" href="style.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
      <link href="css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
      <title>Admine Page</title>
    </head>
<body>
<%@ page import = "com.revature.java.najib.servlets.ApplicationServlet" %>
<%@ page import = "java.util.ArrayList"%>
<%@ page import = "java.util.Iterator"%>
<%@ page import = "java.sql.ResultSet" %>
<%@ page import = "com.revature.java.najib.servlets.LoginServlet" %>
<div class="container">
 <div class="row">
    <nav class=" header">
    <img id="logo" src="logo.PNG"><img id="sologan" src="sologan.PNG">
      <ul class="right hide-on-med-and-down">
        <li><a id="logout"class="btn-small blue darken-1" href="login.html">Log out</a></li>
      </ul>
      
 
  </nav>
  <%
   ResultSet rs = LoginServlet.rs; 
   ResultSet rs1 = LoginServlet.rs1; 
   ResultSet rs2 = LoginServlet.rs2;
  %>
  
        <div class="col s4 main-column blue lighten-4">
        <h5>Supervisor Approval</h5>
	        <ul>
		        <% if(rs != null){
		        while(rs.next()){ 
		        	int i = 1;
		        %>
		        
		        <li><a href="employee?id=<%= rs.getString(i) %>">New Application</a></li>
		        <% 
		        i++;
		        }} %>
	        </ul>

        </div>
         

        <div class="col s4 main-column blue lighten-4">
        <h5>D Head Approval</h5>
	        <ul>
	            <% if(rs1 != null){
		        while(rs1.next()){ 
		        	int i = 1;
		        %>
		        
		        <li><a href="ApprovalThreeServlet?id=<%= rs1.getString(i) %>">Supervisor Approved</a></li>
		        <% 
		        i++;
		        }} %>
	        
	        </ul>

        </div>

        <div class="col s4 main-column blue lighten-4">
         <h5>BenCo Approval</h5>
            <ul>
                <% if(rs2 != null){
		        while(rs2.next()){ 
		        	int i = 1;
		        %>
		        
		        <li><a href="ApprovalOneServlet?id=<%= rs2.getString(i) %>">D.Head Approved</a></li>
		        <% 
		        i++;
		        }} %>   
            </ul>
       
        </div>
  
 </div>
  <footer>
    <div class="footer">        
    <p>Copy Right 2019</p>
    </div>
  </footer>
     
  </div>

  </body>
</html>