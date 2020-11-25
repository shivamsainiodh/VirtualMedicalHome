<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="javax.servlet.http.HttpSession" %>
      <%@ page import="com.model.Patient" %>
        <%@ page import="com.model.Doctor" %>
          <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%   HttpSession mySession;
mySession=request.getSession(true);
ArrayList<Doctor> doctor=(ArrayList<Doctor>)mySession.getAttribute("AL");

Patient p=(Patient)mySession.getAttribute("PATIENT");
%>

       <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

        <meta name="viewport" content="width=device-width, initial-scale=1">
                 <link rel="stylesheet" type="text/css" href="mystylesheet.css">
        
        <title></title>
                 
    </head>
    <body>
 <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
              <div class="navbar-header">
           
                    <a class="navbar-brand" href="patientHomePage.jsp">Virtual Medical Home </a>
                </div>
                    <ul class="nav navbar-nav navbar-right">
                         
                        <li><a href="patientHomePage.jsp"><span class="glyphicon glyphicon-user"></span> WELCOME <%out.println(p.getName()); %></a></li>
                        <li><a href="logout"><span class="glyphicon glyphicon-log-out"></span>log out</a></li>
                        
                    </ul>
                </div>
        </nav><br><br><br><br><br> <center>
        
       <form method="get" action="appointmentSave">
        
       
<table style="background-color:rgba (0, 0, 0, 0.5);" border="3" >
  <tr><th colspan="9">Doctor List</th></tr>
  <tr><th> Doctor Id :</th>
       <th> Doctor Name :</th>
       <th> Doctor Address :</th>
       <th> Doctor Gender :</th>
       <th> Doctor Phone :</th>
       <th> Doctor Qualification :</th>
       <th> Doctor Experience(in years) :</th>
       <th> Doctor Specialization :</th>
       <th>Book Appointment</th>
       </tr>


    <% for(Doctor doc:doctor)
    	{
    	%>
          <tr><td><%out.println(doc.getDoctorId());%></td>
   
              <td><%out.println(doc.getName());%></td>
            <td><%out.println(doc.getAddress());%></td>
    
            <td><%out.println(doc.getGender());%></td>
      
            <td><%out.println(doc.getPhone());%></td>
    
            <td><%out.println(doc.getQualification());%></td>
      
            <td><%out.println(doc.getExperience());%></td>
  
            <td><%out.println(doc.getSpecialization());%></td>
            <td><input type="submit" id="btn" name="submit" value="Book with <%out.println(doc.getDoctorId());%>"/></td>
        </tr>
      
    	
    	<% 
    	}
    	%>
    	
    	
    	
    	
     </table>
      
        </form>
         </center> 
</body>

</html>