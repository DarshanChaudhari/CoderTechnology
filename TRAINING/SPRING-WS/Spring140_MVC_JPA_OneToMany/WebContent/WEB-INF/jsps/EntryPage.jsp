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
 	<p>
 		${msg}	
 		
 	</p>
 	
    <springForm:form method="POST" commandName="command"
        action="submitRegistrationData.hr">
        <table>
            <tr>
                <td>Employee ID :</td>
                <td><springForm:input path="empNo" /></td>
                <td><springForm:errors path="empNo" cssClass="error" /></td>
            </tr>
            <tr>
                <td>Employee Name :</td>
                <td><springForm:input path="empNm" /></td>
                <td><springForm:errors path="empNm" cssClass="error" /></td>
            </tr>
            <tr>
            	<td>Salary :</td>
                <td><springForm:input path="empSal" /></td>
                <td><springForm:errors path="empSal" cssClass="error" /></td>
            </tr>
            
             <tr>
            	<td>Department :</td>
                <td><springForm:input path="deptNo" /></td>
                <td><springForm:errors path="deptNo" cssClass="error" /></td>
            </tr>
            <tr>
                <td colspan="3"><input type="submit" value="Save"></td>
            </tr>
        </table>
 
    </springForm:form>
 
</body>
</html>