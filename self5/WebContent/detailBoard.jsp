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
	<h2>게시물 상세</h2>
	<hr>
	게시물 번호 : ${b.no }<br>
	제목 : ${b.title }<br>
	작성자 : ${b.writer }<br>
	조회수 : ${b.hit }<br>
	작성일 : ${b.regidate }<br>
	내용 : <br>
		<textarea rows="10" cols="80">${b.content }</textarea><br>
	ip주소 : ${b.ip }<br>
	
	<c:if test="${isImg == true }">
		<img src="upload/${b.fname }" width="150" height="150">
	</c:if>
	<c:if test="${isImg == false }">
		<a href="upload/${b.fname }">${b.fname }</a>
	</c:if>
	<a href="insertBoard.do?no=${b.no }">답글작성</a>
	<a href="deleteBoard.do?no=${b.no }">삭제</a>	
</body>
</html>