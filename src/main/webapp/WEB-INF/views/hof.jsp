<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
<link href="styles.css" rel="stylesheet"/>
<script src="hofscript.js"></script>
<meta charset="UTF-8">
<title>CS Hall of Fame</title>
</head>
<body>
	<h1>Computer Science Hall of Fame</h1>
	<table id="myTable">
		<thead>
			<tr>
				<th onclick="sortTable(0)">Name</th>
				<th onclick="sortTable(1)">Invented</th>
				<th onclick="sortTable(2)">Year</th>								
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