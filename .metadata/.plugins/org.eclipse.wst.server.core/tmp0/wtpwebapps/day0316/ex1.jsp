<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("btn").onclick = function(){
			var request = new XMLHttpRequest(); // request객체 생성
			request.open("get", "hello.jsp", false) // 요청할 서버의 프로그램이름을 설정. false는 동기식 : 응답이 올때까지 기다리겠습니다.
			request.send();
			var str = request.responseText;
			// alert(str)
			document.getElementById("msg").innerHTML = str;
		}
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<button id="btn">ajax 통신</button>
	<h2 id="msg"></h2>
</body>
</html>