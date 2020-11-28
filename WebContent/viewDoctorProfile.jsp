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







<form method="get" action="viewAndUpdatedoctor">
     

<center>
<table style="background-color:rgba (0, 0, 0, 0.5);" border="3" >
  <tr><th colspan="2">Doctor Signup</th></tr>
        <tr><td>  Id :</td>
            <td><input type="text" name="id" value=<%out.println(d.getDoctorId()); %>readonly/></td>
        </tr>
        <tr><td> Password :</td>
            <td><input type="password" name="pass" id="pass1" value=<%out.println(d.getPassword()); %> required/></td>
        </tr>
        <tr><td>  Confirm Password :</td>
            <td><input type="password" name="cnfPass" id="pass2"  value=<%out.println(d.getConfirmPassword()); %>required/></td>
        </tr>
         <tr><td>  Name :</td>
            <td><input type="text" name="name" value=<%out.println(d.getName()); %> required/></td>
        </tr>
        <tr><td> Address :</td>
            <td><input type="text" name="add" value=<%out.println(d.getAddress()); %> required/></td>
        </tr>
        <tr><td> Gender :</td>
            <td><input type="text" name="gen" value=<%out.println(d.getGender()); %>required/></td>
        </tr>
        <tr><td> Phone :</td>
            <td><input type="text" name="phone" value=<%out.println(d.getPhone()); %> required/></td>
        </tr>
         <tr><td> Qualification :</td>
            <td><input type="text" name="qualification" value=<%out.println(d.getQualification()); %> required/></td>
        </tr>
         <tr><td> Experience(in years) :</td>
            <td><input type="text" name="ex" value=<%out.println(d.getExperience()); %> required/></td>
        </tr>
         <tr><td> Specialization :</td>
            <td><input type="text" name="spec" value=<%out.println(d.getSpecialization()); %>required/></td>
        </tr>
       
       
      

  <tr><td colspan="2"><input type="submit" name="s1" id="btn" value="Submit"/></td></tr>
  
     </table></center><hr>
     
     </form>              
</body>
</html>