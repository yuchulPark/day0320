<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		var current;
		
		var pro = function(){
			current = setInterval(function(){
				var today = new Date();
				document.getElementById("display").innerHTML = today;
			},1000);
		}
		
		pro();
		
		document.getElementById("btnstop").onclick = function(){
			clearInterval(current);
		}
		document.getElementById("btnstart").onclick = function(){
			pro();
		}
		
	}
</script>
</head>
<body>
	<h1>현재 시간</h1>
	<h2 id="display"></h2>
	<button id="btnstart">시작</button>
	<button id="btnstop">중지</button>
</body>
</html>