<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Product Details</title>
	</head>
		
		<body>
		<form action="" method="post">
			<jsp:include page="Head01.jsp"></jsp:include>
			<jsp:include page="Head02.jsp"></jsp:include>
			
			<table border = "1"><br>
			
				<tr>					
					<th>Product Id</th>
					<th>Product Name</th>
					<th>Category</th>
					<th>Price</th>					
					<th style="width :50px">Quantity</th>
					<th>Add to Cart</th>					
				</tr>
				
				<tr>
					<td>${requestScope.prodDetails.productId}</td>
					<td>${requestScope.prodDetails.productName}</td>
					<td>${requestScope.prodDetails.category}</td>
					<td>${requestScope.prodDetails.price}</td>	
					<td style="text-align:center;"><input type="text" name="quantity" maxlength=1 style="width: 15px;" pattern="[0-3]"/></td>
					<td><input type="submit" name="add" value="ADD" Style="width: 6em;  height: 2em"/></td>  <!-- After this we have to create switch where we have to navigate on another jsp to show selected items-->
									
				</tr>	
	
			</table>
			<br>
			<!-- Providing HyperLink to provide list of the employee -->
			<a href="prodList.do">Go back to List</a> 		
		</form>
		</body>
		
	</html>