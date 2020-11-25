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
        
        <title>doctor signup</title>
                 
    </head>
    <body>
 <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
              <div class="navbar-header">
           
                    <a class="navbar-brand" href="Index.jsp">Virtual Medical Home </a>
                </div>
                    <ul class="nav navbar-nav navbar-right">
                         <li><a href="Index.jsp"><span class="glyphicon glyphicon-home"></span> HOME</a></li>
                        <li><a href="login.jsp"><span class="glyphicon glyphicon-user"></span> LOG IN</a></li>
                        <li><a href="signup.jsp"><span class="glyphicon glyphicon-log-in"></span> SIGN UP</a></li>
                         <li><a href="about.jsp"><span class="glyphicon glyphicon-info-sign"></span> ABOUT US</a></li>
                    </ul>
                </div>
        </nav><br><br><br><br><br>
 <form method="get" action="doctorSignup">
     

<center>
<table style="background-color:rgba (0, 0, 0, 0.5);" border="3" >
  <tr><th colspan="2">Doctor Signup</th></tr>
        <tr><td>  Id :</td>
            <td><input type="text" name="id" required/></td>
        </tr>
        <tr><td> Password :</td>
            <td><input type="password" name="pass" id="pass1" required/></td>
        </tr>
        <tr><td>  Confirm Password :</td>
            <td><input type="password" name="cnfPass" id="pass2" required/></td>
        </tr>
         <tr><td>  Name :</td>
            <td><input type="text" name="name" required/></td>
        </tr>
        <tr><td> Address :</td>
            <td><input type="text" name="add" required/></td>
        </tr>
        <tr><td> Gender :</td>
            <td><input type="text" name="gen" required/></td>
        </tr>
        <tr><td> Phone :</td>
            <td><input type="text" name="phone" required/></td>
        </tr>
         <tr><td> Qualification :</td>
            <td><input type="text" name="qualification" required/></td>
        </tr>
         <tr><td> Experience(in years) :</td>
            <td><input type="text" name="ex" required/></td>
        </tr>
         <tr><td> Specialization :</td>
            <td><input type="text" name="spec" required/></td>
        </tr>
       
       
      

  <tr><td colspan="2"><input type="submit" name="s1" id="btn" value="Submit"/></td></tr>
  
     </table></center><hr>
     
     </form>              
</body>
</html>