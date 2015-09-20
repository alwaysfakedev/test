<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
    <title>Login Page</title>
</head>

<body>

<h3>Login with Username and Password</h3>

<c:if test="${not empty error}">
    Error: ${error}
</c:if>

<form name='loginForm' action="submit" method='POST'>
    User: <input type='text' name='username' value=''><br/>
    Password: <input type='password' name='password' value=''/><br/>
    <input name="submit" type="submit" value="submit" />
</form>

<br/> <br/><a href="">Return to Fake Menu</a>
  <br/> <br/><a href="user/new">Registration</a>
</body>
</html>