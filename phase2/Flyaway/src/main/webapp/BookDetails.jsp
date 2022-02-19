
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product view portal</title>
</head>
<body>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
  padding: 5px;
}
</style>

</head>
<body>
<center>
<h2>Booking Successfull</h2>
<jsp:useBean id="product" class="FlightBooking.Product" scope="session"></jsp:useBean>

<br><table >
<tr>
<th> Booking Id </th>
<th>First Name 	</th>
<th>last Name	</th>
<th>Email 	</th>
<th>City Name  </th>
</tr>
<tr>

	<jsp:setProperty property="id" name="product"/>  
	<jsp:setProperty property="fname" name="product"/>  
	<jsp:setProperty property="lname" name="product"/>  
	<jsp:setProperty property="email" name="product"/>  
	<jsp:setProperty property="cityname" name="product"/>  <br><br>
<h3>Booking Details : </h3> 
<td><jsp:getProperty property="id" name="product"/></td>
<td><jsp:getProperty property="fname" name="product"/></td>
<td><jsp:getProperty property="lname" name="product"/></td>  
<td><jsp:getProperty property="email" name="product"/></td>  
<td><jsp:getProperty property="cityname" name="product" /></td>
</tr>
</table>
</center> 


</body>
</html>
