<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="com.jp.hr.entities.Emp" %>
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
	 <table border = "1">
	 
		 
 <!--This give jstl for employee details link below  this shows once you click on the view details link you will get the output -->
 
			 	<tr>
			 		<th>Employee Id</th>
			 		<th>View Details</th>			 		
			 	</tr>
			 	
			 	<c:forEach items="${ requestScope.empList}" var="emp">
		 	<tr>
		 	 	<td>${emp.empNo}</td>  <!-- this property empId will call getEmpId -->
		 		<td><a href="empDetails.hr?id=${emp.empNo}">View Employee Details</a></td>
		 		
		 	</tr>	
		 </c:forEach>
 			 
				 
	</table> 
	 
	 <a href="homePage.hr">Go to Home Page</a>
</body>
</html>