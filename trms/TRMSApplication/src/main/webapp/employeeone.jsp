	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Approval</title>
	 <link rel="stylesheet" href="css/forme.css" >
	 <style>
	 input{
	   text-align: center;
	 }
	 </style>
	</head>
	<body>
	<%@ page import = "com.revature.java.najib.services.ApprovalProcessiongService" %>
	<%@ page import = "java.sql.ResultSet" %>
	<%@ page import = "com.revature.java.najib.servlets.ApprovalThreeServlet" %>
	<%@ page import = "java.io.OutputStream" %>
	<% 
		String id = request.getParameter("empid");
		ResultSet rs = ApprovalThreeServlet.rs2;  
		if(rs != null){
			while(rs.next()){
	%>
	  <div class="container">
	                <h2> Employee Reimbursement Application</h2>
	                    <form action="approval" method="post">
	                    <div id="home"><a href="login.html">Lotout<a></div>
	                        <fieldset>
	                            <legend>Application</legend>
	                        <table>
	                            <thead>
	                                <tr>
	                                    <td>Employee ID</td>
	                                    <td>Full Name</td>
	                                    <td>Supervisor ID</td>
	                                    <td>Date</td>
	                                </tr>
	                                </thead>
	                              <tbody>
	                                <tr>
	                                    <td><input type="text" name="empid" value="<%= rs.getString(1) %>" readonly ></td>
	                                    <td><input type="text" name="fname" value="<%= rs.getString(3) %>"readonly ></td>
	                                    <td><input type="text" name="supid" value="<%= rs.getString(2) %>" readonly ></td>
	                                    <td><input type="text" name="date" value="<%= rs.getString(10) %>" readonly /></td>
	                                </tr>
	                                </tbody>
	                        </table><br>
	                         <table>
	                            <thead>
	                                <tr>
	                                    <td>Event Type</td>
	                                    <td>Location</td>
	                                    <td>Cost</td>
	                                    <td>Award Amount</td>
	                                </tr>
	                                </thead>
	                              <tbody>
	                                <tr>
	                                    <td><input type="text" name="events" value="<%= rs.getString(4) %>" readonly ></td>         
	                                    <td><input type="text" name="location" value="<%= rs.getString(5) %>" readonly ></td>
	                                    <td><input type="number" name="cost" value="<%= rs.getString(6) %>" readonly ></td>
	                                    <td><input type="number" name="amount" value="<%= rs.getString(7) %>" readonly></td>
	                                </tr>
	                                </tbody>
	                             <table><br>
	                          <table>
	                             <thead>
	                                <tr>
	                                    <td>Grading</td>
	                                     <td>Presentation</td>
	                                    <td> &nbsp;Grading Doc  &nbsp;  &nbsp;  &nbsp;</td>
	                                    <td> &nbsp;  &nbsp;Presentation Doc</td>
	                                </tr>
	                                </thead>
	                              <tbody>
	                                <tr>
	                                    <td><input type="text" name="grade" value="<%= rs.getString(8) %>" readonly></td>
	                                    <td><input type="text" name="pret" readonly value="Yes" id="yes"></td>
	                                    <td> &nbsp;<a href="">Document</a></td>
	                                    <td> &nbsp;  &nbsp;  &nbsp;<a href="">Document</a></td>
	                                </tr>
	                                </tbody>
	                        </table><br>
	                                 <p>Justification</p>
	                                 <textarea name="justification" rows="10" cols="90" readonly><%= rs.getString(11) %>
	                                 </textarea><br>
	                                 <input type="checkbox" name="approve" value="dephead">
	                                 <input type="submit" value="Submit" name="submit" id="submit">
	                        </fieldset>
	                        
	                             
	                                 
	                    </form>
	        </div>    
	        <%}} %>
	  
	</body>
	</html>