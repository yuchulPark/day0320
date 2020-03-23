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
	<h2>상품 목록</h2>
	<hr>
	<a href="insertGoods.do">상품 등록</a>
	<c:forEach var="vo" items="${list }">
		<a href="detailGoods.do?no=${vo.no }">
		<div>
			<img src="img/${vo.fname }" width="150" height="150">
			<b>${vo.item }</b>(${vo.price })
		</div>
		</a>
	</c:forEach>
	<br>
	<c:forEach var="i" begin="1" end="${totalPage }">
		<a href="listGoods.do?pageNUM=${i }">${i }</a>
	</c:forEach>
</body>
</html>