<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>상세정보</h2>
	고객번호 : ${vo.custid}<br>
	이름 : ${vo.name }<br>
	주소 : ${vo.addr }<br>
	전번 : ${vo.phone }<br>
	<br>
	<a href="updateCustomer.do?custid=${vo.custid }">수정</a>
	<a href="deleteCustomer.do?custid=${vo.custid }">삭제</a>
</body>
</html>