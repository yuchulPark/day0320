<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$("h2").bind("click", function(){ // 밑 코딩과 같다.
		alert($(this).html())
	})
	$("h2").click(function(){ // 위 코딩과 같다.
		alert($(this).html())
	})
});
</script>
<title>Insert title here</title>
</head>
<body>
	<h2>이순신</h2>
	<h2>홍길동</h2>
	<h2>유관순</h2>
</body>
</html>