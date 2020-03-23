<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#div{
		width:500px;
		height:500px;
		background:yellow;
	}
</style>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("div").onclick = function(){
			alert("레이어를 눌렀어요.");
		}
		document.getElementById("btn").onclick = function(){
			alert("버튼을 눌렀어요.");
		}
	}
</script>
</head>
<body>
	<div id="div">
		레이어입니다.<br>
		<button id="btn">버튼</button>
	</div>
</body>
</html>