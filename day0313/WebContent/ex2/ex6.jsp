<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("h2").first().appendTo("body"); // 대상이 되는 A를 맨 뒤로 보냄
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>A</h2>
	<h2>B</h2>
	<h2>C</h2>
	<h2>D</h2>
	<h2>E</h2>
</body>
</html>