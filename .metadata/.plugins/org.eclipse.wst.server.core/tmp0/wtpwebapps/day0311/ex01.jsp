<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	#div{
		width:500px;
		height:500px;
		background:yellow;
	}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("btn").onclick = function(){
			alert("버튼");
			var event = window.event;
			event.stopPropagation(); // 부모 노드로의 이벤트 전파를 막음
		}
		document.getElementById("div").onclick = function(){
			alert("레이어")
		}
	}
</script>
</head>
<body>
	<div id="div">
		레이어입니다. <br>
		<button id="btn">버튼</button>
	</div>
</body>
</html>