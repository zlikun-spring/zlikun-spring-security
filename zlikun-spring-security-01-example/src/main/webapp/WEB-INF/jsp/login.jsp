<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Login</title>
    <sec:csrfMetaTags/>
</head>
<body>

<div>${not empty error ? error : ""}</div>

<form name="loginForm" action="<c:url value='/j_spring_security_check' />" method="POST">
    <sec:csrfInput/>
    <input name="username" placeholder="输入用户名"><br>
    <input name="password" type="password"><br>
    <input type="submit" value="登录">
</form>

</body>
</html>