<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
<link href="styles.css" rel="stylesheet"/>
<script src="script.js"></script>
<meta charset="UTF-8">
<title> Hall of Fame | Complete</title>
</head>
<body>
	<h1>CS Hall of Fame - Complete List</h1>
	
	<table id="myTable">
		<thead>
			<tr>
				<th onclick="sortTable(0)">First Name</th>
				<th onclick="sortTable(1)">Last Name</th>
				<th onclick="sortTable(2)">Innovation</th>
				<th onclick="sortTable(3)">Year</th>								
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
	<a href="/hof">Go back to Hall of Fame Landing Page</a> <br />
	<a href="/">Go back to home</a>
	
	
</body>
</html>