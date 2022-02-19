<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket Booking Page</title>
</head>
<body>
<div align="center">
<form action="BookDetails.jsp">
<h1>Personal Information...</h1>
Booking Id <input type = "number" name=id required ><br><br>
Enter The First Name<input type="text" name="fname"><br><br>
Enter The Last Name<input type="text" name="lname"><br><br>
<h5>Enter The Gender</h5>
Male<input type="radio" ><br><br>
Female<input type="radio"><br><br>

Enter The Mail<input type="text" name="email"><br><br>
Enter The City Name<input type="text" name="cityname"><br><br>
Click To Save<input type="Submit" value="save">


</form>
</div>
</body>
</html>