<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%--  <%@ page import ="com.jp.stock.entities.Products" %>
    <%@ page import = "java.util.ArrayList" %>     --%>     
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product List</title>
</head>
<body>
	<table border  = "1">
		<!-- <tr>
			<th>Product ID</th>
			<th>Product View</th>
 -->
		
		<%-- <c:forEach items="${ requestScope.prodList}" var="prod">
		 	<tr>
		 	 	<td>${prod.productId}</td>  <!-- this property empId will call getEmpId -->
		 		<td>${prod.productName}</td>
		 		<td>${prod.category}</td>
		 		<td>${prod.price}</td>
		 	</tr>	
		 </c:forEach--%>
		 
		 
		 		 	<tr>
			 		<th>Product Id</th>
			 		<th>View Details</th>			 		
			 	</tr>
			 	
			 	<c:forEach items="${ requestScope.prodList}" var="prod">			 	
		 	<tr>
		 	 	<td>${prod.productId}</td>  
		 		<td><a href="prodDetails.do?id=${prod.productId}">View</a></td>
		 		
		 	</tr>	
		 </c:forEach>
	
	</table> 
</body>
</html>