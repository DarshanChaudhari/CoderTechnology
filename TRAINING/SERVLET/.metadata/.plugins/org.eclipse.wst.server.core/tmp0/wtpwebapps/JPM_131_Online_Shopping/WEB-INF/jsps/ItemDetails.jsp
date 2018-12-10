<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Item List</title>
</head>
<body>
<br><br><br>
	<div class = "container text-center"> 
		<table border = "1">
			<tr>
				<th width="100px">Item Id</th>
				<th width="100px">Name</th>
				<th width="100px">Category</th>
				<th width="100px">Price</th>
			</tr>
			<tr>
				<td>${requestScope.itemDetails.itemId}</td>
				<td>${requestScope.itemDetails.name}</td>
				<td>${requestScope.itemDetails.category}</td>
				<td>${requestScope.itemDetails.price}</td>
			<td>${requestScope.itemDetails.itemId}</td>
			<td>${requestScope.itemDetails.name}</td>
			<td>${requestScope.itemDetails.category}</td>
			<td>${requestScope.itemDetails.price}</td>
			</tr>		
		</table>
		<br>
		<br>
		
	</div>	
	<p><a href="itemList.do">Go back to Item List</a> 
</body>
</html>