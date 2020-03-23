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
		
		var colorArr = ["red","green","blue"];
		$("span").css("background", function(idx){
			// $(this).attr("idx", idx);
			return colorArr[idx];
		});
		$("span").click(function(){
			var color = $(this).css("background-color")
			// var color = colorArr[$(this).attr("idx")]
			context.strokeStyle = color; // 이거를 주석처리하고, 위의 두개 주석을 풀어도 실행됨
		})
		$(canvas).toggle(function(event){ // 매개변수로 이벤트
			var position = $(this).offset(); // offset() : 화면으로부터 얼마만큼 떨어져있는 거리
			var x = event.pageX - position.left; // 선이 그려질 좌표
			var y = event.pageY - position.top; // 선이 그려질 좌표
			
			context.beginPath(); // 시작 좌표
			context.moveTo(x, y); // 시작 지점으로 이동
		}, function(event){
			var position = $(this).offset(); // offset() : 화면으로부터 얼마만큼 떨어져있는 거리
			var x = event.pageX - position.left; // 선이 그려질 좌표
			var y = event.pageY - position.top; // 선이 그려질 좌표	

			context.lineTo(x, y);
			context.stroke();
		}); 
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<canvas id="canvas" width="300" height="300"></canvas>
	<br>
	<span>빨간색</span>
	<span>초록색</span>
	<span>파랑색</span>
</body>
</html>