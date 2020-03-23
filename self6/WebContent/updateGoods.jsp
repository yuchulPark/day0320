<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>상품 수정</h2>
	<hr>
	<form action="updateGoodsOK.do" method="post" enctype="multipart/form-data">
		<input type="hidden" name="no" value="${vo.no }">
		상품명 : <input type="text" name="item" value="${vo.item }"><br>
		가격 : <input type="number" name="price" value="${vo.price }"><br>
		수량 : <input type="number" name="qty" value="${vo.qty }"><br>
		첨부파일 : <br><img src="img/${vo.fname }" width="150" height="150">
			<br><input type="file" name="fname"><br>
		상세설명 : <br><textarea rows="10" cols="80" name="detail">${vo.detail }</textarea><br>
			<input type="submit" value="수정">
			<input type="reset" value="취소">
	</form>
</body>
</html>