<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="styles.css" rel="stylesheet"/>
<script src="script.js"></script>
<meta charset="UTF-8">
<title>Grand Circus Info</title>
</head>
<body>
	<h1><c:out value="${ org }"/></h1>
	
	<h3>Rooms</h3>
		<ul>
			<c:forEach var="room" items="${ rooms }">
				<li>${ room.name } is on level ${ room.level}</li>
			</c:forEach>
		</ul>
		
	<h3>CEO</h3>
		<c:out value="${ ceo.firstName } ${ceo.lastName }"></c:out>
			
	<h3>Languages</h3>	
	
	<table id="myTable">
		<thead>
			<tr>
				<th onclick="sortTable(0)">Name</th>
				<th onclick="sortTable(1)">Creator First Name</th>
				<th onclick="sortTable(2)">Creator Last Name</th>								
			</tr>
		</thead>
		<tbody>
			<c:forEach var="language" items="${ languages }">				
				<tr>
					<td>${ language.name }</td>
					<td>${ language.creator.firstName }</td>
					<td>${ language.creator.lastName }</td>					
				</tr>					
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>