<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>상품수정</h2>
	<form action="updateGoodsOk.do" method="post" enctype="multipart/form-data">
		<input type="hidden" name="no" value="${g.no }">
		상품명 : <input type="text" name="item" value="${g.item }"><br>
		가격 : <input type="number" name="price" value="${g.price }"><br>
		수량 : <input type="number" name="qty" value="${g.qty }"><br>
		<img  src="img/${g.fname }" width="50" height="50"><br>
		사진 : <input type="file" name="fname"><br>
		상세설명 : <br>
		<textarea rows="10" cols="80" name="detail">${g.detail }</textarea><br>
		<input type="submit" value="수정">
		<input type="reset" value="취소">
	</form>
</body>
</html>








