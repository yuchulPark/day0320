<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<img src="logo.jpg"><br>
	비트 사커몰
	<c:if test="${manager != null }">
		<b><i>관리자 모드</i></b>
	</c:if>
</body>
</html>









