<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="managerLogOut.do">관리자 로그아웃</a>
	<img src="logo.jpg" width="100" height="100"><br>
	크리드
	<c:if test="${manager != null }">
		관리자 로그인
	</c:if>
	<br>
	
</body>
</html>