<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	#canvas{
		width:3000px;
		height:1000px;
	}
	#jol{
		position:absolute;
		left:10px;
		top:10px;
	}
</style>
<script type="text/javascript">
	window.onload = function(){
		var x = 10;
		var y = 10;
		var vX = 10; // X축으로 한번 움직이는 속도(거리)
		var vY = 10; // Y축으로 한번 움직이는 속도(거리)
		var dX = 0; // X축으로 총 이동할 거리
		var dY = 0; // Y축으로 총 이동할 거리
		var endX = 0; // 마우스 눌러진 x위치
		var endY = 0; // 마우스 눌러진 y위치
		var timeID; // 타이머를 위한 아이디
		
		var jol = document.getElementById("jol");
		document.getElementById("canvas").onmousedown = function(){
			var event = window.event;
			endX = event.x; // x 좌표
			endY = event.y; // y 좌표
			
			// x축으로 이동하는 거리와 y축으로 이동하는 거리를 동일하게 하기 위하여 각각의 거리를 구하여 동일한 비율로 나눔
			dX = Math.abs(endX - x); // 양수 만들기
 			dY = Math.abs(endY - y);
			
			vX = dX / 100;
			vY = dY / 100;
			
			if(x > endX){
				vX = -vX;
			}
			if(y > endY){
				vY = -vY;
			}
			var i = 0
			timeID = setInterval(function(){
				x += vX;
				y += vY;
				jol.style.left = x + "px";
				jol.style.top = y + "px";
				if(i >= 100){
					clearInterval(timeID);
				}
				i++;
			},10);
		}
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="canvas">
		<img id="jol" src="jol.png">
	</div>
</body>
</html>