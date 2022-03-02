<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
	xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
<head>
<title>Greetings!</title>
</head>
<body>

	
<center>
	<h1>Welcome!</h1>
	</center>
	
	<p>
		Click <a th:href="@{/welcome}">here</a> to see a greeting.
	</p>
</body>
</html>