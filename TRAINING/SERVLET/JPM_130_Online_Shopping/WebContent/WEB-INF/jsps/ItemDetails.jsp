<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Employee Details</title>
	</head>
		<body>
		<jsp:include page="Head01.jsp"></jsp:include>
		<jsp:include page="Head02.jsp"></jsp:include>
		<h4>ITEMS DETAILS</h4>
			<%-- Welcome Mr./Ms. ${ sessionScope.userFullName }
			<a href="logout.do">Logout</a> --%>
			<table border = "1">
				<tr>					
					<th>Item Id</th>
					<th>Name</th>
					<th>Category</th>
					<th>Price</th>	
				</tr>
				
				<tr>
					<td>${requestScope.ItemDetails.itemId}</td>
					<td>${requestScope.ItemDetails.itemName}</td>
					<td>${requestScope.ItemDetails.category}</td>
					<td>${requestScope.ItemDetails.price}</td>
				</tr>				
			</table>	
			</br>
			<!-- Providing HyperLink to provide list of the employee -->
			<a href="itemList.do">Go back to List</a> 		
		</body>
	</html>