<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("btnNew").onclick = function(){
			window.open("http://www.naver.com","","width=400, height=400"); // 이름은 공백처리
		}
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<button id="btnNew">네이버</button>
</body>
</html>