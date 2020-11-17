<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
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
           
                    <a class="navbar-brand" href="Index.html">Virtual Medical Home </a>
                </div>
                    <ul class="nav navbar-nav navbar-right">
                         <li><a href="Index.html"><span class="glyphicon glyphicon-home"></span> HOME</a></li>
                        <li><a href="login.jsp"><span class="glyphicon glyphicon-user"></span> LOG IN</a></li>
                        <li><a href="signup.jsp"><span class="glyphicon glyphicon-log-in"></span> SIGN UP</a></li>
                         <li><a href="about.jsp"><span class="glyphicon glyphicon-info-sign"></span> ABOUT US</a></li>
                    </ul>
                </div>
        </nav><br><br><br><br><br>
 <form method="get" action="http://localhost:8080/VirtualMedicalHome/LoginServlet">
     

<center>
<table style="background-color:rgba (0, 0, 0, 0.5);" border="3" >
  <tr><th colspan="2">LOGIN</th></tr>
        <tr><td>  Id :</td>
            <td><input type="text" name="id" required/></td>
        </tr>
        <tr><td>  Password :</td>
            <td><input type="password" name="pass" required/></td>
        </tr>
        <tr><td>ROLE:-<td>ADMIN:<input type="radio" name="rad" value="admin" />
                          PATIENT:<input type="radio" name="rad" value="patient" />
                          DOCTOR:<input type="radio" name="rad" value="doctor" /></td>
      

  <tr><td colspan="2"><input type="submit" name="s1" id="btn" value="Submit"/></td></tr>
  </table></center><br>
     </form>   
     <center>
     <h3>Not a Member?</h3>
    <a href="signup.jsp"><input type="submit" name="s2" id="btn" value="Register"/></a>
     
     </center>
     
     
     
                
</body>
</html>