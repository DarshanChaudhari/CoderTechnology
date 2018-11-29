<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Menu</title>
</head>
<body>
	
	<jsp:include page="Head01.jsp"></jsp:include>
	<h3 align="center">Main Menu</h3>	
	<jsp:include page="Head02.jsp"></jsp:include>	
	
	<ul>
		<li><a href="prodList.do">View Product List</a></li>
		<li><a href="newProduct.do">Add New Product</a></li>
	</ul>
</body>
</html>