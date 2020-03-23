<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btnHTML").click(function(){
			var str = "<img src='stock1.jpg'>"
			$("#result").html(str); // 그림이 나옴
		})
		$("#btnTEXT").click(function(){
			var str = "<img src='stock1.jpg'>"
			$("#result").text(str); // 글자가 나옴
		})
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="result"></div>
	<button id="btnHTML">HTML()</button>
	<button id="btnTEXT">TEXT()</button>
</body>
</html>