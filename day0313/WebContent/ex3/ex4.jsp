<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	.highlight{
		background: yellow;
	}
</style>
<meta charset="UTF-8">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$("h2").bind({
		click:function(){
			alert($(this).html())
		},
		mouseover:function(){
			$(this).addClass("highlight")
		},
		mouseleave:function(){
			$(this).removeClass("highlight")
		}
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