<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>상품 상세</h2>
	<hr>
	상품 번호 : ${vo.no }<br>
	상품명 : ${vo.item }<br>
	가격 : ${vo.price }<br>
	수량 : ${vo.qty }<br>
	상품 사진 : <br>
		<img src="img/${vo.fname }" width="150" height="150"><br>
	상세 설명 : <br>
		<textarea rows="10" cols="80" readonly="readonly">${vo.detail }</textarea><br>
	<a href="updateGoods.do?no=${vo.no }">수정</a>
	<a href="deleteGoods.do?no=${vo.no }">삭제</a>
</body>
</html>