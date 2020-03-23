<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>관리자 로그인</h2>
	<form action="managerLoginOK.do" method="post">
		관리자명 : <input type="text" name="id"><br>
		암호 : <input type="password" name="pwd"><br>
		<input type="submit" value="로그인">
		<input type="reset" value="취소">
	</form>
</body>
</html>