<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Product Details</title>
	</head>
		<body>
			<table border = "1">
				<tr>
					<th>Product Id</th>
					<th>Product Name</th>
					<th>Category</th>
					<th>Price</th>					
				</tr>
				
				<tr>
					<td>${requestScope.prodDetails.productId}</td>
					<td>${requestScope.prodDetails.productName}</td>
					<td>${requestScope.prodDetails.category}</td>
					<td>${requestScope.prodDetails.price}</td>
				</tr>				
			</table>	
			
			<!-- Providing HyperLink to provide list of the employee -->
			<a href="prodList.do">Go back to List</a> 		
		</body>
	</html>