<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	#canvas{
		border: solid 2px black;
	}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-1.7.min.js"></script>
<script type="text/javascript">
	$(function(){
		var canvas = document.getElementById("canvas") // 자바스크립트 객체로 사용. 캔바스 노드에 그림을 그리기 위해서는 context를 얻어와야하는데 이건 자바스크립트꺼다.
		var context = canvas.getContext("2d");
		
		$("#btn").click(function(){
			context.beginPath();
			context.moveTo(10,10); // context를 가지고 10,10으로 이동해주세요
			context.lineTo(110,10); // 110, 10까지 
			context.stroke(); // 선을 그려주세요
		})
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<canvas id="canvas" width="300" height="300"></canvas>
	<button id="btn">가로선 그리기</button>
</body>
</html>