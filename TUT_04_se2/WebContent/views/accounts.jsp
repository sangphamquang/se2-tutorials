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
		<h1 align="center">Accounts</h1>
		
		<table border="1">
			<thead align="center">
				<tr>
					<th>ID</th>
					<th>UserName</th>
					<th>Password</th>
				</tr>
			</thead>
			<tbody align="center">
				<c:choose>
					<c:when test="${accounts == null}">
						<tr>
							<td colspan="3">No user found</td>
						</tr>
					</c:when>
					<c:otherwise>
						<c:forEach var="acc" items="${accounts}">

						<tr>
							<td><c:out value="${acc.id}" /></td>
							<td><c:out value="${acc.userName}" /></td>
							<td><c:out value="${acc.password}" /></td>
					</c:forEach>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>
	</div>
</body>
</html>