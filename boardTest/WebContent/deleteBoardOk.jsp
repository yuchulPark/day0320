<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${re >0 }">
	<!--<jsp:forward page="listBoard.do"/>-->
	<c:redirect url="listBoard.do"/>
</c:if>

게시물 삭제에 실패하였습니다.<br>
<a href="listBoard.do">게시물 목록</a>

</body>
</html>









