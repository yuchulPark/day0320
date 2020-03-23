<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	window.onload = function() {
		function pro(){
			alert("안녕")
		}
		var header = document.getElementById("header")
		header.onclick = pro;
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 id="header"></h1>
</body>
</html>