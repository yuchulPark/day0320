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
	<h2>회원 목록</h2>
	<hr>
	<a href="insertCustomer.do">회원 등록</a>
	<br>
		<form action="listCustomer.do" method="post">
			<select name="searchColumn">
				<option value="custid">고객번호</option>
				<option value="name">이름</option>
				<option value="address">주소</option>
				<option value="phone">전번</option>
			</select>
				<input type="text" name="keyword">
				<input type="submit" value="검색">
		</form>
	<br>
	<table border="1" width="80%">
		<tr>
			<td><a href="listCustomer.do?sortColumn=custid">고객번호</a></td>
			<td><a href="listCustomer.do?sortColumn=name">이름</a></td>
			<td><a href="listCustomer.do?sortColumn=address">주소</a></td>
			<td><a href="listCustomer.do?sortColumn=phone">전번</a></td>
		</tr>
		<c:forEach var="c" items="${list }">
			<tr>
				<td>${c.custid }</td>
				<td>
					<a href="detailCustomer.do?custid=${c.custid }">${c.name }</a>
				</td>
				<td>${c.address }</td>
				<td>${c.phone }</td>
			</tr>
		</c:forEach>
	</table>
	<a href="listCustomer.do?all=1">모두출력</a>
</body>
</html>