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
        action="submitProductData.fin">
        <table>
            <tr>
                <td>Product ID :</td>
                <td><springForm:input path="productId" /></td>
                <td><springForm:errors path="productId" cssClass="error" /></td>
            </tr>
            <tr>
                <td>Product Name :</td>
                <td><springForm:input path="productName" /></td>
                <td><springForm:errors path="productName" cssClass="error" /></td>
            </tr>
            <tr>
            	<td>Category :</td>
                <td><springForm:input path="category" /></td>
                <td><springForm:errors path="category" cssClass="error" /></td>
            </tr>            
            <tr>
            	<td>Price :</td>
                <td><springForm:input path="price" /></td>
                <td><springForm:errors path="price" cssClass="error" /></td>
            </tr>
            
            <tr>
                <td colspan="3"><input type="submit" value="Save"></td>
            </tr>
        </table>
 
    </springForm:form>
 
</body>
</html>
