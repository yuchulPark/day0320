<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("tr:odd").css("background","#f9f9f9"); // 홀수
		$("tr:even").css("background","#9f9f9f"); // 짝수
		$("tr:first").css("background","#000000").css("color","#ffffff") // 첫번째. 메소드 체인 : 연속해서 메소드를 호출하는것
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="80%">
		<tr><td>이름</td><td>국어</td><td>영어</td><td>수학</td></tr>
		<tr><td>홍</td><td>1</td><td>1</td><td>1</td></tr>
		<tr><td>김</td><td>2</td><td>2</td><td>2</td></tr>
		<tr><td>이</td><td>3</td><td>3</td><td>3</td></tr>
		<tr><td>박</td><td>4</td><td>4</td><td>4</td></tr>
	</table>
</body>
</html>