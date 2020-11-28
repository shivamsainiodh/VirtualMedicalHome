<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.model.Patient" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%   HttpSession mySession;
mySession=request.getSession(true);
Patient patient=(Patient)mySession.getAttribute("PATIENT");
%>

       <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

        <meta name="viewport" content="width=device-width, initial-scale=1">
                 <link rel="stylesheet" type="text/css" href="mystylesheet.css">
        
        <title>Login</title>
                 
    </head>
    <body>
 <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
              <div class="navbar-header">
           
                    <a class="navbar-brand" href="patientHomePage.jsp">Virtual Medical Home </a>
                </div>
                    <ul class="nav navbar-nav navbar-right">
                         
                        <li><a href="patientHomePage.jsp"><span class="glyphicon glyphicon-user"></span> WELCOME <%out.println(patient.getName()); %></a></li>
                        <li><a href="logout"><span class="glyphicon glyphicon-log-out"></span>log out</a></li>
                        
                    </ul>
                </div>
        </nav><br><br><br><br><br>
        <center>
      
      
      
         
       <form method="get" action="savecomplaint">
        
       
<table style="background-color:rgba (0, 0, 0, 0.5);" border="3" >
 <tr><th colspan="2">Complaint box</th></tr>
        <tr><td>  Doctor-Id :</td>
            <td><input type="text" name="id" required/></td>
        </tr>
        <tr><td> Your Complaint :</td>
            <td><textarea name="complain"  rows="5" column="30"  >Enter your Complaint here</textarea></td>
        </tr>
          <tr><td colspan="2"><input type="submit" name="s1" id="btn" value="Submit"/></td></tr>
  
     </table></center><hr>
     
     </form>              
      
   
</body>

</html>