<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<html>
<body>
	<h1>Title : ${title}</h1>
	<h1>Message : ${message}</h1>

	<sec:authorize access="hasRole('ADMIN')">
		显示`ROLE_ADMIN`角色信息<br>
	</sec:authorize>
	<sec:authorize access="hasRole('USER')">
		显示`ROLE_USER`角色信息<br>
	</sec:authorize>

	<div><a href="/logout">登出</a></div>

</body>
</html>