<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		var colorList = ["red","blue","green"];
		$("h1").css({background:"yellow", color:function(idx){
			return colorList[idx]
		}})
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>이순신</h1>
	<h1>유관순</h1>
	<h1>홍길동</h1>
</body>
</html>