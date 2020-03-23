<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	window.onload = function(){
		var myWindow;
		document.getElementById("btnNew").onclick = function(){
			myWindow = window.open("","","width=400, height=200");
		}
		document.getElementById("btnPrint").onclick = function(){
			myWindow.document.write("<h2>코로나</h2>");
		}
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<button id="btnNew">새창열기</button>
	<button id="btnPrint">새창에 내용 출력</button>
</body>
</html>