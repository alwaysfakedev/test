<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Sample Hello Page</title>
</head>
<body>
	<h1>Title : ${title}</h1>	
	<h1>Message : ${message}</h1>
	
	Try the following links: <br/>

	<a href="hello"><b>/hello</b> - Hello (without parameters)</a> <br/> <br/>
	<a href="hello?name=Guest"><b>/hello?name=Guest</b> - Hello (with name parameter)</a><br/> <br/>
	
	<a href="welcome"><b>/welcome</b> - Public page</a><br/> <br/>
	<a href="login"><b>/login</b> - Login page</a><br/> <br/>
</body>
</html>