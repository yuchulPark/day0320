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
		var context = canvas.getContext("2d")
		var colorArr = ["red", "green", "blue"];

		$(canvas).toggle(function(event){
			var position = $(this).offset();
			var x = event.pageX - position.left
			var y = event.pageY - position.top
			
			context.beginPath();
			context.moveTo(x,y)
		}, function(event){
			var position = $(this).offset()
			var x = event.pageX - position.left
			var y = event.pageY - position.top
			
			context.lineTo(x, y)
			context.stroke()
		})
		
		$("span").css("background", function(i){
			return colorArr[i]
		})
		$("span").click(function(){
			var color = $(this).css("background-color")
			context.strokeStyle = color;
		})
	})
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<canvas id="canvas" width="500" height="500"></canvas>
	<br>
	<span>빨간색</span>
	<span>초록색</span>
	<span>파랑색</span>
</body>
</html>