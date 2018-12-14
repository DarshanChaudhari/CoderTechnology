<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="com.jp.hr.entities.Product" %>
    <%@ page import = "java.util.ArrayList" %>          
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product List</title>
</head>
<body>
	<jsp:include page="Head01.jsp"></jsp:include>
	<jsp:include page="Head02.jsp"></jsp:include>
	<table border  = "1">
	
		 		 	<tr>
			 		<th>Product Id</th>
			 		<th>View Details</th>			 		
			 	</tr>
			 	
			 	<c:forEach items="${ requestScope.prodList}" var="prod">			 	
		 	<tr>
		 	 	<td>${prod.productId}</td>  
		 		<td><a href="prodDetails.fin?id=${prod.productId}">View Product</a></td>
		 		
		 	</tr>	
		 </c:forEach>
		<tr> 
	 	<td><a href="homePage.fin">Go to Home Page</a></td>
	 	</tr>
	</table> 
</body>
</html>