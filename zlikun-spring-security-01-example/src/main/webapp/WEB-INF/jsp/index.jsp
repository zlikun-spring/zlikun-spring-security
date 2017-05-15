<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>Index</title>
	<meta charset="UTF-8">
</head>
<body>

	<h1>Spring Security ,Hello <sec:authentication property="name" /></h1>

	<h3><a href="/admin" target="_blank">Admin</a> | <a href="/user" target="_blank">User</a> | <a href="/logout">Logout</a></h3>

</body>
</html>