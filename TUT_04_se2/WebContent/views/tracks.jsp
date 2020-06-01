<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users list</title>
</head>
<body>
	<div class="container">
		<h1 align="center">Tracks</h1>
		
		<table border="1">
			<thead align="center">
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Track Number</th>
					<th>Duration</th>
				</tr>
			</thead>
			<tbody align="center">
				<c:choose>
					<c:when test="${tracks == null}">
						<tr>
							<td colspan="4">No user found</td>
						</tr>
					</c:when>
					<c:otherwise>
						<c:forEach var="t" items="${tracks}">

						<tr>
							<td><c:out value="${t.id}" /></td>
							<td><c:out value="${t.name}" /></td>
							<td><c:out value="${t.track_number}" /></td>
							<td><c:out value="${t.duration}" /></td>
					</c:forEach>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>
	</div>
</body>
</html>