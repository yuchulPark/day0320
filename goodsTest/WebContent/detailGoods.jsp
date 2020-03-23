<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 상품수정에 대한 기능을 구현해 봅니다. -->
	<h2>상품상세</h2>
	<hr>
	상품번호 : ${g.no }<br>
	상품명 : ${g.item }<br>
	상품가격 : ${g.price }<br>
	상품수량 : ${g.qty }<br>
	<img  src="img/${g.fname }" width="200" height="200"><br>
	상세설명 : <br>
	<textarea rows="10" cols="80" readonly="readonly">${g.detail }</textarea><br>
	<a href="updateGoods.do?no=${g.no }">수정</a>
	<a href="deleteGoods.do?no=${g.no }">삭제</a>
	<a href="listGoods.do">상품목록</a>
</body>
</html>











