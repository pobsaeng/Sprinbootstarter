<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Person Form</h1>
	
	<form:form modelAttribute="usersForm" action="${pageContext.request.contextPath}/submitForm" method="post">
		<div>ID:<input type="text" name="id"/></div>
		<div>First name:<input type="text" name="firstname"/></div>
		<div>Last name:<input type="text" name="lastname"/></div>
		<div>Age:<input type="text" name="age"/></div>
		<div><input type="submit" value="Save"/></div>
	</form:form>
	
	<br>
	<c:if test="${!empty error}"><div style="color:red;  font-weight:bold;">${error}</div></c:if>
</body>
</html>