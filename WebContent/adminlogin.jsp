<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<<head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
        <link href="https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css" rel="stylesheet">
        <!--jQuery library--> 
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

        <!--Latest compiled and minified JavaScript--> 
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
                 <link rel="stylesheet" type="text/css" href="mystylesheet.css">
        
        <title>Admin Login</title>
                 
    </head>
    <body>
 <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
              <div class="navbar-header">
           
                    <a class="navbar-brand" href="Index.html">Virtual Medical Home </a>
                </div>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="Index.html"><span class="glyphicon glyphicon-home"></span> HOME</a></li>
                        <li><a href="admin.jsp"><span class="glyphicon glyphicon-user"></span> ADMIN</a></li>
                        <li><a href="user.jsp"><span class="glyphicon glyphicon-log-in"></span> USER</a></li>
                        <li><a href="doctor.jsp"><span class="glyphicon glyphicon-log-in"></span> DOCTOR</a></li>
                         <li><a href="about.jsp"><span class="glyphicon glyphicon-info-sign"></span> ABOUT US</a></li>
                    </ul>
                </div>
        </nav><br><br><br><br><br>
 <form method="get" action="http://localhost:8082/VirtualMedicalHome/adminServlet">
     

<center>
<table style="background-color:rgba (0, 0, 0, 0.5);" border="3" >
  <tr><th colspan="2">ADMIN LOGIN</th></tr>
        <tr><td> Admin Id :</td>
            <td><input type="text" name="id" required/></td>
        </tr>
        <tr><td> Admin Password :</td>
            <td><input type="password" name="pass" required/></td>
        </tr>
      

  <tr><td colspan="2"><input type="submit" name="s1" id="btn" value="Submit"/></td></tr>
  
     </table></center><hr>
     
     </form>              
</body>
</html>