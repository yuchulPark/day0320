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
	<c:if test="${re > 0 }">
		<c:redirect url="listGoods.do"/>
	</c:if>
	
	상품삭제에 실패하였습니다. <br>
	<a href="listGoods.do">상품목록</a>	
	
</body>
</html>