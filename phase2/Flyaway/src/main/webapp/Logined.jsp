<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Login Page</title>
</head>
<body>

<h2>loged In successfull</h2>
<%= "Welcome "+request.getParameter("cemail") %>
<a href= "info.jsp">Click Here For Flight Info</a>

</body>
</html>