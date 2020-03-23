<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>고객 수정</h2>
	<form action="updateCustomer.do" method="post">
		고객번호 : <input type="number" name="custid" value="${vo.custid }" readonly="readonly"><br>
		이름 : <input type="text" name="name" value="${vo.name }"><br>
		주소 : <input type="text" name="address" value="${vo.address }"><br>
		전번 : <input type="text" name="phone" value="${vo.phone }"><br>
			<input type="submit" value="수정">
			<input type="reset" value="취소">
	</form>
</body>
</html>