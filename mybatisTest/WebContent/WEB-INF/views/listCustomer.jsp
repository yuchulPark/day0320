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
	<h2>고객목록</h2>
	<table border="1" width="80%">
		<tr>
			<td>고객번호</td>
			<td>이름</td>
			<td>주소</td>
			<td>전번</td>
		</tr>
		<c:forEach var="vo" items="${list }">
			<tr>
				<td>${vo.custid }</td>
				<td>${vo.name }</td>
				<td>${vo.address }</td>
				<td>${vo.phone }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>