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
		<h1 align="center">Users</h1>
		
		<table border="1">
			<thead align="center">
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Address</th>
					<th>Mobile</th>
				</tr>
			</thead>
			<tbody align="center">
				<c:choose>
					<c:when test="${listUser == null}">
						<tr>
							<td colspan="4">No user found</td>
						</tr>
					</c:when>
					<c:otherwise>
						<c:forEach var="user" items="${listUser}">

						<tr>
							<td><c:out value="${user.id}" /></td>
							<td><c:out value="${user.name}" /></td>
							<td><c:out value="${user.address}" /></td>
							<td><c:out value="${user.mobile}" /></td>
					</c:forEach>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>
	</div>
</body>
</html>