<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Employee Details</title>
	</head>
		<body>
		<jsp:include page="Head01.jsp"></jsp:include>
		<jsp:include page="Head02.jsp"></jsp:include>
			<%-- Welcome Mr./Ms. ${ sessionScope.userFullName }
			<a href="logout.do">Logout</a> --%>
			<table border = "3">
				<tr>
					<th>Department Id</th>
					<th>Department Name</th>										
				</tr>
				<tr>
					<td>${requestScope.deptDetails.deptNo}</td>
					<td>${requestScope.deptDetails.deptNm}</td>
				</tr>	
			</table>
			
			<br><br>
				<table border = "3">
				<tr>
					<th>Employee Id</th>
					<th>Employee Name</th>	
					<th>Employee Salary</th>									
				</tr>		
				
				<c:forEach items="${ requestScope.deptDetails.empList}" var="emp">
				<tr>
					<td>${emp.empNo}</td>
					<td>${emp.empNm}</td>
					<td>${emp.empSal}</td>
				</tr>	
				</c:forEach>			
			</table>	
			
			<!-- Providing HyperLink to provide list of the employee -->
			<a href="deptList.hr">Go back to Department List</a> 		
		</body>
	</html>