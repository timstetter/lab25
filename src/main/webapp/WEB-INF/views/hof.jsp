<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CS Hall of Fame</title>
</head>
<body>
	<h1>Computer Science Hall of Fame</h1>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Invented</th>
				<th>Year</th>								
			</tr>
		</thead>
		<tbody>
			<c:forEach var="tiny" items="${ tinys }">				
				<tr>
					<td>${ tiny.name }</td>
					<td>${ tiny.invented }</td>
					<td>${ tiny.year }</td>					
				</tr>					
			</c:forEach>
		</tbody>
	</table>
	<a href="/complete">Go to complete list</a>
</body>
</html>