<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		var sun = document.getElementById("sun");
		var earth = document.getElementById("earth");
		var moon = document.getElementById("moon");

		sun.style.position = "absolute"; // 절대위치 설정
		earth.style.position = "absolute";
		moon.style.position = "absolute";
		
		sun.style.left = 220 + 'px';
		sun.style.top = 200 + 'px';
		
		var earthAngle = 0;
		var moonAngle = 0;
		
		setInterval(function(){
			var earthLeft = 220 + 120 * Math.cos(earthAngle);
			var earthTop = 200 + 120 * Math.sin(earthAngle);
			
			var moonLeft = earthLeft + 20 * Math.cos(moonAngle);
			var moonTop = earthTop + 20 * Math.sin(moonAngle);
		
			earth.style.left = earthLeft + 'px';
			earth.style.top = earthTop + 'px';
		
			moon.style.left = moonLeft +'px';
			moon.style.top = moonTop +'px';
			
			earthAngle += 0.1;
			moonAngle += 0.3;
		},2000/30);
	}
</script>
</head>
<body>
	<div id="sun"><img src="sun.jpg" width="50" height="50"></div>
	<div id="earth"><img src="earth.jpg" width="35" height="35"></div>
	<div id="moon"><img src="moon.jpg" width="20" height="20"></div>
</body>
</html>