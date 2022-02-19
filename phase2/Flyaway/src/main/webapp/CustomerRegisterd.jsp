<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registerd</title>
</head>
<body>
<h3>Registration success </h3>
<%= "Welcome "+request.getParameter("cname") %>

<a href="TicketBook.jsp"> To Book click Here</a>
</body>
</html>