<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Info Page</title>

</head>
<body>
<div style="background-image:url(' D:/Company/phase 2/Pageimage/info.jpg');  background-repeat: no-repea;">
<div align="center">
<h1>Travel Information</h1>

<form action="searchinfo" method="get">
Enter Source<input type="text" name="source" required><br><br>
Enter Destination<input type="text" name="desti" required><br><br>
Enter The Travel Date<input type="datetime-local" id="datepicker" name="source"><br><br>
<h5>eg.pune,mumbai,banglore,hydrabad,chennai...</h5>

Check your Flight<input type="submit" value="click">




<h4>Click Here to Book Ticket</h4>
<a href="TicketBook.jsp"> To Book click Here</a>

</form>
</div>
</body>
</html>
