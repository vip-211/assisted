<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
 <link type="text/css" rel="stylesheet" href="resources/css/login.css"> 
  
</head>
<body style="">

  <center> <h1> Login </h1> </center>   
    <form action="loginProcess" method="POST">  
        <div class="container">   
        	<input type="hidden" name="command" value="LOGIN" />
            <label>Username : </label>   
            <br/>
            <input type="text" placeholder="Enter Username" name="username" required>  
            <br/>
            <label>Password : </label>   
            <br/>
            <input type="password" placeholder="Enter Password" name="password" required>
            <input type="checkbox" onclick="myFunction()">Show Password  
            <br/>
            <button type="submit">Login</button>   
            <br/>
            <a href="${pageContext.request.contextPath}/register">Sign </a>   
          
        </div>   
    </form>     


</body>
</html>