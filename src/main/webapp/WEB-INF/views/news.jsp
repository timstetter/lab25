<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>News API</title>
</head>
<body>

	<h1>Top 20 articles about PlayStation 5</h1>
	
	<c:forEach var="article" items="${ news }">
		<h3><c:out value="${ article.title }"/></h3>
		<p><b>From:</b> <c:out value="${ article.source.name }"/> <br />
			<b>By:</b> <c:out value="${ article.author }" /></p>
		<p><c:out value="${ article.description }"/></p>
		<p><a href="${ article.url }"><c:out value="${ article.title }"/></a></p>
	</c:forEach>

</body>
</html>