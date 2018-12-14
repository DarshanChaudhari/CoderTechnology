<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form"
    prefix="springForm"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
<style>
.error {
    color: #ff0000;
    font-style: italic;
    font-weight: bold;
}
</style>
</head>
<body>
	<jsp:include page="Head01.jsp"></jsp:include>
	
 	<p>
 		${msg}	
 		
 	</p>
 	
    <springForm:form align="center" method="POST" commandName="command"
        action="submitComplaintForm.cr">
        <table align="center">
        	
            <tr>
                <td>Account Id :</td>
                <td><springForm:input path="accountId" /></td>
                <td><springForm:errors path="accountId" cssClass="error" /></td>
            </tr>
            <tr>
                <td>Branch Code :</td>
                <td><springForm:input path="branchCode" /></td>                
            </tr>
            <tr>
            	<td>Email Id :</td>
                <td><springForm:input path="emailId" /></td>
                <td><springForm:errors path="emailId" cssClass="error" /></td>
            </tr>
            
             <tr>
                <td>Complaint Category :</td>
                <td><springForm:select path="category">
                    <springForm:option value="Select">Select</springForm:option>
                    <springForm:option value="Internet Banking">Internet Banking</springForm:option>
                   <springForm:option value="General Banking">General Banking</springForm:option>
                   <springForm:option value="Others">Others</springForm:option>       
                   </springForm:select>             
                </td>                
            </tr>
            
             <tr>
            	<td>Description :</td>
                <td><springForm:textarea path="description" rows="5" cols="30" /></td>
                               
            </tr>
            
            <tr>
                <td colspan="3" align="center"><input type="submit" value="Submit" ></td>
                
            </tr>
        </table>
 		
    </springForm:form>
	<br>
	<a href="showStatus.cr"><p style="text-align:center">Check Status</a>
	
</body>
</html>