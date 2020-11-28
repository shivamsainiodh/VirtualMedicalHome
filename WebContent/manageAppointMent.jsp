<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="javax.servlet.http.HttpSession" %>
     <%@ page import="com.model.Doctor" %>
      <%@ page import="com.model.Appointment" %>
          <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%   HttpSession mySession;
mySession=request.getSession(true);
Doctor d=(Doctor)mySession.getAttribute("DOCTOR");
ArrayList<Appointment> ap=(ArrayList<Appointment>)mySession.getAttribute("APPOINT");
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
           
                    <a class="navbar-brand" href="DoctorHomePage.jsp">Virtual Medical Home </a>
                </div>
                    <ul class="nav navbar-nav navbar-right">
                         
                        <li><a href="DoctorHomePage.jsp"><span class="glyphicon glyphicon-user"></span> WELCOME DR. <%out.println(d.getName()); %></a></li>
                        <li><a href="logout"><span class="glyphicon glyphicon-log-out"></span>log out</a></li>
                        
                    </ul>
                </div>
        </nav><br><br><br><br><br>
        
        
        <% for(Appointment a:ap)
        	{
        	
        	

        	out.println(a.getDoctorId()+" "+d.getDoctorId());
        	out.println(a.getDoctorId().equalsIgnoreCase(d.getDoctorId()));
       
        	
        	if(a.getDoctorId().equals(d.getDoctorId()))
        	{
        		out.println("hello");
            }
        	}
        %>
        
        
        
</body>
</html>