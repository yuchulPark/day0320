<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		// $("h2").html("김유신");
		// $("h2").text("김유신");
		// var str = $("h2").html(); // 첫번째 하나만 가져옴
		var str = $("h2").text(); // 글자로 처리해서 다 가져옴
		alert(str)
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>홍길동</h2>
	<h2>이순신</h2>
	<h2>유관순</h2>
</body>
</html>