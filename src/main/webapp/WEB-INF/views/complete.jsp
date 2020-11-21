<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Hall of Fame | Complete</title>
</head>
<body>
	<h1>CS Hall of Fame - Complete List</h1>
	
	<table>
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Innovation</th>
				<th>Year</th>								
			</tr>
		</thead>
		<tbody>
			<c:forEach var="complete" items="${ completes }">				
				<tr>
					<td>${ complete.firstName }</td>
					<td>${ complete.lastName }</td>
					<td>${ complete.innovation }</td>
					<td>${ complete.year }</td>					
				</tr>					
			</c:forEach>
		</tbody>
	</table>
	<a href="/">Go back to home</a>
	
	
</body>
</html>