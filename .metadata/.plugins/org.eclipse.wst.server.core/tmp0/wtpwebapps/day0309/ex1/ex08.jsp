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
			var arr = document.getElementsByTagName("h1"); // h1 태그를 모두 찾아달라는 뜻. 배열을 반환함
			arr[0].innerHTML = "java";
			arr[1].innerHTML = "oracle";
		}
	}
</script>
</head>
<body>
	<h1>자바</h1>
	<h2>오라클</h2>
	<button id="btn">영어로 바꾸기</button>
</body>
</html>