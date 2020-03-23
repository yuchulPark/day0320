<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h2>memLoginOk</h2>
	ID : ${m.id }<br />
	PW : ${m.pw }<br />
	<br>
	<p>the time on the server is ${serverTime }</p>
	<br>
	<a href="/exam0308/resources/html/index.html">Go Main</a>
</body>
</html>