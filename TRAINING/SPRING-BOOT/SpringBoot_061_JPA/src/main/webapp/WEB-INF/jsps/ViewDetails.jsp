<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Employee Details</h2>
	
	<table border =1>
		
		<tr>
			<th>Head</th>
			<th>Value</th>
		</tr>
		
		<tr>
			<th>Name</th>
			<td>${emp.empNm}</td>	
		</tr>
		
		<tr>
			<th>Salary</th>
			<td>${emp.empSal}</td>	
		</tr>
		
		<tr>
			<th>Employee ID</th>
			<td>${emp.empNo}</td>	
		</tr>

	</table>
</body>

</html>