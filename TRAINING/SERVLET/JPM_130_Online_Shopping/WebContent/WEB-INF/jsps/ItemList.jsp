<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="com.jp.cart.entities.*" %>
    <%@ page import = "java.util.ArrayList" %>    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee List</title>
</head>
<body>
<!-- 	<Table>EMPLOYEE LIST</Table> -->
	<!-- ${ requestScope.empList }  --> 
	<jsp:include page="Head01.jsp"></jsp:include>
	<jsp:include page="Head02.jsp"></jsp:include>
	<!-- <a href="logout.do">Logout</a> -->
	 <table border = "1">
	 
			 	<tr>
			 		<th>Item Id</th>
			 		<th>Name</th>			 		
			 	</tr>
			 	
			 	
			 	<c:forEach items="${ requestScope.itemList}" var="item">
		 	<tr>
		 	 	<td>${item.itemId}</td> 
		 	 	<td>${item.itemName}</td>
		 		<td><a href="itemDetails.do?id=${item.itemId}">Show Details</a></td>
		 		<td><a href="cart.do?id=${item.itemId}">Add to Cart</a></td>			 		
		 	</tr>	
		 </c:forEach>
		 
		 <a href="mainMenu.do">Go back to Home</a> 		
 			 
		
	</table> 
	 
</body>
</html>