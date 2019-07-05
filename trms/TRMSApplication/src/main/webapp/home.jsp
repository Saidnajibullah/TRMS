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
      <title>Home Page</title>
    </head>
    <% String pass = request.getParameter("password"); %>
<body>
<div class="container">
 <div class="row">
    <nav class=" header">
    <img id="logo" src="logo.PNG"><img id="sologan" src="sologan.PNG">
      <ul class="right hide-on-med-and-down">
        <li><a id="logout"class="btn-small blue darken-1" href="login.html">Log out</a></li>
      </ul>
      
 
  </nav>

 

        <div class="col s4 main-column blue lighten-4">
        <h5>Application</h5>
        <ul>
        <li><a href="application.html">Reimbursement Form</a></li>
        <li><a href="CheckStatusServlet?id=<%=pass%>">Application Status</a></li>
        </ul>

        </div>   

        <div class="col s4 main-column blue lighten-4">
        <h5>Reimbursement</h5>
        <p>
        The purpose of Reimbursement Program is to provide a system that encourages quality 
        knowledge growth relevant to our employees' expertise. Currently,
         the company provides reimbursements for university courses, seminars, 
         certification preparation classes, certifications, 
         and technical training.
        </p>
        <p>We appreciate your hard working as well as your strong motivation 
        to improving skills and work related knowledge. We do our best to
        to help gain the required expertise.   
        </p>

        </div>

        <div class="col s4 main-column blue lighten-4">
         <h5>Reimbursable Events</h5>
         <ul>
         <li>University Courses</li>
         <li>certification preparation</li>
         <li>technical training</li>
         <li>certifications</li>
         <li>seminars</li>
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
