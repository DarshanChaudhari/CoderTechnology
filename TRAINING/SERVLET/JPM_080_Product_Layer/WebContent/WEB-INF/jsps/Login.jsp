<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login Portal</title>
</head>
<body>
	<jsp:include page="Head01.jsp"></jsp:include>
	<p style ='color:red'> ${ message }</p>
	<form  name="frm" method='POST' action="authenticate.do">
		User Name :<input type="text" name="username"> <br/>
		Password  :<input type="password" name="password"> <br/>
		<input type="submit" name="submit" value="ok">
	</form>
</body>
</html>