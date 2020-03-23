<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("btn").onclick = function(){
			document.getElementById("creed").src = "ff.jpeg";
		}	
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<img src="logo.jpg" id="creed">
	<button id="btn">상품바꾸기</button>
</body>
</html>