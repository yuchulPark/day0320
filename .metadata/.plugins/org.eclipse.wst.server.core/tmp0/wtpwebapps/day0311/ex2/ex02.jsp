<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	#div{
		width:600px;
		height:1000px;
	}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		document.body.onclick = function(){
			var div = document.getElementById("div");
			div.innerHTML = ""; // 초기화
			var event = window.event; // 객체안의 객체
			// 객체가 가지고 있는 속성만큼 루프를 돌음
			for(var key in event){
				div.innerHTML += key + "======>" + event[key] + "<br>" // += : 누적하라는 뜻
			}
		}
	}
</script>
</head>
<body>
	<div id="div"></div>
</body>
</html>