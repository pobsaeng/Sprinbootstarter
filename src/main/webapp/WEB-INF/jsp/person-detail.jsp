<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Person Detail!!</h2>
	

	<c:if test="${!empty personList}">

		<c:forEach items="${personList}" var="person">
			<div> <c:out value="${person.id}" /> </div>
			<div> <c:out value="${person.firstname}" /> </div>
			<div> <c:out value="${person.lastname}" /> </div>
			<div> <c:out value="${person.age}" /> </div>
		</c:forEach>

	</c:if>
	
	<br/>
	<a href="showPersonForm">Go to Person Form</a>
</body>
</html>