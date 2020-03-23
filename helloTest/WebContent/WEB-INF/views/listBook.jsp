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
	<h2>도서 목록</h2>
	<table border="1" width="80%">
		<tr>
			<td>도서번호</td>
			<td>도서명</td>
			<td>출판사명</td>
			<td>가격</td>
		</tr>
			<c:forEach var="l" items="${list }">
				<tr>
					<td>${l.bookid }</td>
					<td>${l.bookname }</td>
					<td>${l.publisher }</td>
					<td>${l.price }</td>
				</tr>
			</c:forEach>
	</table>
</body>
</html>