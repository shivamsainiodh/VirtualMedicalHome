<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="javax.servlet.http.HttpSession" %>
     <%@ page import="java.sql.ResultSet" %>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%   HttpSession mySession;
mySession=request.getSession(true);
String Name=(String)mySession.getAttribute("NAME");


ResultSet rs=(ResultSet)mySession.getAttribute("rs");


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
           
                    <a class="navbar-brand" href="adminHomepage.jsp">Virtual Medical Home </a>
                </div>
                    <ul class="nav navbar-nav navbar-right">
                         
                        <li><a href="adminHomepage.jsp"><span class="glyphicon glyphicon-user"></span> WELCOME <%out.println(Name); %></a></li>
                        <li><a href="http://localhost:8080/VirtualMedicalHome/LogoutServlet"><span class="glyphicon glyphicon-log-out"></span>log out</a></li>
                        
                    </ul>
                </div>
        </nav><br><br><br><br><br> <center>
        
       <form method="get" action="http://localhost:8080/VirtualMedicalHome/AppointmentSave">
        
       
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


    <% while(rs.next())
    	{
    	%>
          <tr><td><%out.println(rs.getString(1));%></td>
   
              <td><%out.println(rs.getString(4));%></td>
            <td><%out.println(rs.getString(5));%></td>
    
            <td><%out.println(rs.getString(6));%></td>
      
            <td><%out.println(rs.getString(7));%></td>
    
            <td><%out.println(rs.getString(8));%></td>
      
            <td><%out.println(rs.getString(9));%></td>
  
            <td><%out.println(rs.getString(10));%></td>
            <td><input type="submit" id="btn" name="submit" value="Book with <%=rs.getString(1)%>"/></td>
        </tr>
      
    	
    	<% 
    	}
    	%>
    	
    	
    	
    	
     </table>
      
        </form>
         </center> 
</body>

</html>