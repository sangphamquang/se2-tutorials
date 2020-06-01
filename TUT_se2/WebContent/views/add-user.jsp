<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>User Management</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="nav-bar.jsp"></jsp:include>
	<br>
	<form action="add" method="post">
		<label>Id:<input type="number" name="id"></label><br>
		<label>Name:<input type="text" name="name"></label><br>
		<label>Mobile:<input type="text" name="mobile"></label><br>
		<label>Address:<input type="text" name="address"></label><br>
		<input type="submit">
	</form>
</body>
</html>
