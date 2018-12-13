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
			<%-- Welcome Mr./Ms. ${ sessionScope.userFullName }
			<a href="logout.do">Logout</a> --%>
			<table border = "1">
				<tr>
					<th>Employee Id</th>
					<th>Name</th>
					<th>Salary</th>
					<th>Department</th>					
				</tr>
				
				<tr>
					<td>${requestScope.empDetails.empNo}</td>
					<td>${requestScope.empDetails.empNm}</td>
					<td>${requestScope.empDetails.empSal}</td>
					<td>${requestScope.empDetails.dept.deptNm}</td> <!--Here we are calling the deptNm, In this we have create a object of dept in emp by getter setter  -->
				</tr>				
			</table>	
			
			<!-- Providing HyperLink to provide list of the employee -->
			<a href="empList.hr">Go back to Employee List</a> 		
		</body>
	</html>