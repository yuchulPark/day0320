<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("btn").onclick = function(){
			document.getElementById("msg").innerHTML = "안녕";
		}
	}
</script>
</head>
<body>
	<button id="btn">버튼</button>
	<span id="msg"></span>
</body>
</html>