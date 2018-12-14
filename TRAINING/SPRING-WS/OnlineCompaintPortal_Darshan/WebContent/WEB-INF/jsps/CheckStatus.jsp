<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form"
    prefix="springForm"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Save Page</title>
<style>
.error {
    color: #ff0000;
    font-style: italic;
    font-weight: bold;
}
</style>
</head>
<body>
 	
 	<h2 align="center"><u><i>Check Status</i></u></h2>
 	
    <form method="POST" action="compDetails.cr">
        <table align="center">
            <tr>
                <td>Complaint Id:</td>
                <td><input type ="text" name= "complaintId" /></td>  
                            
            </tr>            
            <tr>            
               <td colspan="3" align="center"><button name ="Submit">Check Status</button></td>       
            </tr>
        </table>
 
    </form>
	    
		<table border = "2" align ="center">			
				<tr>					
					<th>Complaint Id</th>
					<th>Description</th>
					<th>Status</th>										
				</tr>
				
				<tr>
					<td>${requestScope.compDetails.complaintId}</td>
					<td>${requestScope.compDetails.description}</td>
					<td>${requestScope.compDetails.status}</td>									
				</tr>	
	
			</table>
 
</body>
</html>