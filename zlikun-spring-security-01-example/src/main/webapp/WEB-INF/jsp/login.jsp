<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Login</title>
</head>
<body>

	<div>${not empty error ? error : ""}</div>
	<div><%=session.getId() %></div>

	<form name="loginForm" action="/j-spring-security-check" method="POST">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		<input name="username" placeholder="输入用户名"><br>
		<input name="password" type="password"><br>
		<input type="submit" value="登录">
	</form>

</body>
</html>