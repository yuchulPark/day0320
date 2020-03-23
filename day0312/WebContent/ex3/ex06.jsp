<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("tr:nth-child(5n)").css("background","#000000").css("color","pink"); // 5개마다 위치하는 행을 선택
		$("tr:nth-child(5n+1)").css("background","#000000").css("color","blue");
		$("tr:nth-child(5n+2)").css("background","#000000").css("color","green");
		$("tr:nth-child(5n+3)").css("background","#000000").css("color","red");
		$("tr:nth-child(5n+4)").css("background","#000000").css("color","black");
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
		<tr><td>홍</td><td>1</td><td>1</td><td>1</td></tr>
		<tr><td>김</td><td>2</td><td>2</td><td>2</td></tr>
		<tr><td>이</td><td>3</td><td>3</td><td>3</td></tr>
		<tr><td>박</td><td>4</td><td>4</td><td>4</td></tr>
		<tr><td>홍</td><td>1</td><td>1</td><td>1</td></tr>
		<tr><td>김</td><td>2</td><td>2</td><td>2</td></tr>
		<tr><td>이</td><td>3</td><td>3</td><td>3</td></tr>
		<tr><td>박</td><td>4</td><td>4</td><td>4</td></tr>
		<tr><td>홍</td><td>1</td><td>1</td><td>1</td></tr>
		<tr><td>김</td><td>2</td><td>2</td><td>2</td></tr>
		<tr><td>이</td><td>3</td><td>3</td><td>3</td></tr>
		<tr><td>박</td><td>4</td><td>4</td><td>4</td></tr>
		<tr><td>홍</td><td>1</td><td>1</td><td>1</td></tr>
		<tr><td>김</td><td>2</td><td>2</td><td>2</td></tr>
		<tr><td>이</td><td>3</td><td>3</td><td>3</td></tr>
		<tr><td>박</td><td>4</td><td>4</td><td>4</td></tr>
		<tr><td>홍</td><td>1</td><td>1</td><td>1</td></tr>
		<tr><td>김</td><td>2</td><td>2</td><td>2</td></tr>
		<tr><td>이</td><td>3</td><td>3</td><td>3</td></tr>
		<tr><td>박</td><td>4</td><td>4</td><td>4</td></tr>
	</table>
</body>
</html>