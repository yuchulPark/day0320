<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	#logo{
		position:absolute;
		left:10px;
		top:400px;
	}
</style>
<script type="text/javascript">
	window.onload = function(){
		var arr = ["sun.jpg","earth.jpg","moon.jpg"];
		var left = 10;
		var logo = document.getElementById("logo");
		var i = 0;
		var step = 30;
		
		setInterval(function(){
			if(left >= window.innerWidth - 30 || left < 10){
				step = step * -1;
			}
			left = left + step;
			logo.style.left = left + "px";
			logo.childNodes[0].src = arr[i];
			i++;
			if(i>=arr.length){
				i = 0;
			}
		},100);
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="logo"><img src="sun.jpg" width="100" height="100"></div>
</body>
</html>