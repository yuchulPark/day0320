<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		session.invalidate(); // 세션을 파기하는 메소드. 논리적인 연결을 끊는 것
		response.sendRedirect("listGoods.do");
	%>
</body>
</html>