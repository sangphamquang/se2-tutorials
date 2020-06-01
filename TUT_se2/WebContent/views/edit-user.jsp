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
	<%-- TO-DO: Include navigation bar (nav-bar.jsp)  --%>
	<jsp:include page="nav-bar.jsp"></jsp:include>
	<br>
	<%-- TO-DO: CREATE A FORM FOR UPDATING USER --%>
	<form action="update" method="post">
		<label>Id:<input type="number" name="id"
			value="<c:out value="${user.id}"></c:out>"></label><br> <label>Name:<input
			type="text" name="name" value="<c:out value="${user.name}" />"></label><br>
		<label>Mobile:<input type="text" name="mobile"
			value="<c:out value="${user.address}" />"></label><br> <label>Address:<input
			type="text" name="address" value="<c:out value="${user.mobile }" />"></label><br>
		<input type="submit">
	</form>
</body>
</html>
