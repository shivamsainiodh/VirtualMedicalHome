<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%   HttpSession mySession;
mySession=request.getSession(true);
String Name=(String)mySession.getAttribute("NAME");
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
           
                    <a class="navbar-brand" href="adminHomepage.jsp">Virtual Medical Home </a>
                </div>
                    <ul class="nav navbar-nav navbar-right">
                         
                        <li><a href="adminHomepage.jsp"><span class="glyphicon glyphicon-user"></span>Welcome <%out.println(Name); %></a></li>
                        <li><a href="logout.jsp"><span class="glyphicon glyphicon-log-out"></span>log out</a></li>
                        
                    </ul>
                </div>
        </nav><br><br><br><br><br>
</body>
</html>