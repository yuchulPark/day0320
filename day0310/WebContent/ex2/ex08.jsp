<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	#logo{
		position:absolute;
		left:10px;
		top:400px;
	}
</style>
<script type="text/javascript">
	window.onload = function(){
		var left = 10;
		var logo = document.getElementById("logo");
		
		setInterval(function(){
			left = left + 10;
			logo.style.left = left + "px";
		},100);
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="logo"><img src="logo.jpg" width="100" height="100"></div>
</body>
</html>