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
	<a href="insertCustomer.do">고객 등록</a>
	<h2>고객 목록</h2>
	<table border="1" width="80%">
		<tr>
			<td>고객번호</td>
			<td>이름</td>
		</tr>
		<c:forEach var="l" items="${list }">
			<tr>
				<td>${l.custid }</td>
				<td>
					<a href="detailCustomer.do?custid=${l.custid }">${l.name }</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>