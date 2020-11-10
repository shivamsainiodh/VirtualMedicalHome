<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="aqua">
<form method="get" action="http://localhost:8085/VirtualMedicalHome/PatientData">
<center>
<table border="1" bgcolor="pink">
<tr><td colspan="2"><center>Patient Registration</center></td></tr>
<tr><td>Enter PatientId </td><td><input type="text" name="pid" required></td></tr>
<tr><td>Enter FirstName </td><td><input type="text" name="fName"></td></tr>
<tr><td>Enter LastName </td><td><input type="text" name="lName"></td></tr>
<tr><td>Enter DOB </td><td><input type="date" name="dob"></td></tr>
<tr><td>Enter Occupation </td><td><input type="text" name="occ"></td></tr>
<tr><td>Enter Gender </td><td><input type="radio" name="gen" value="Male">Male
<input type="radio" name="gen" value="Female">Female
<input type="radio" name="gen" value="Other">Other
</td></tr>
<tr><td>Enter Address </td><td><textarea rows="4" cols="30" name="add"></textarea></td></tr>
<tr><td>Enter City </td><td><input type="text" name="city"></td></tr>
<tr><td>Enter State</td><td><input type="text" name="state"></td></tr>
<tr><td>Enter MobileNo</td><td><input type="tel" name="mob"></td></tr>
<tr><td><center><input type="submit" value="Submit"></center></td><td><center><input type="reset" value="Reset"></center></td></tr>
</table>
</center>
</form>
</body>
</html>

