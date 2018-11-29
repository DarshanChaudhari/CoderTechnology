<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- The below line is used to disable jsp session management by making false, after you have done ity false the line 13 will not 
    work. That doesnot means session is not there -->
    <%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Menu</title>
</head>
<body>
	<h2>Main Menu</h2>
	<%-- On JSP: <%=session.getId() %> --%>
	<a href="logout">Logout</a>
</body>
</html>