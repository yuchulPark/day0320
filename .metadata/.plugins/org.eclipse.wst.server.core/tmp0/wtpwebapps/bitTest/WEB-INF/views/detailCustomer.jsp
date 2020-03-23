<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>고객 상세</h2>
	고객번호 : ${c.custid }<br>
	이름 : ${c.name }<br>
	주소 : ${c.address }<br>
	전번 : ${c.phone }<br>
	<a href="updateCustomer.do?custid=${c.custid }">수정</a>
	<a href="deleteCustomer.do?custid=${c.custid }">삭제</a>	
</body>
</html>