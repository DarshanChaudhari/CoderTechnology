<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Employee Saved Successfully</title>
</head>
<body>
 
	<h6></h6>
	<p align="center"><i>Complaint Id for this request is :${command.complaintId}.</i></p>
	<p align="center"><i>Thanks for raising a complaint.</i></p><br>
	<a  href="compDetails.cr?complaintId=${command.complaintId}"><p style="text-align:center">Check status</a> &nbsp;&nbsp; <a href="homePage.cr">Raise Complaint</a>
	 
	 
</body>
</html>