<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="bit.js"></script>
<script type="text/javascript">
	window.onload = function(){
		// var a = nextRandomInteger(10);
		// var a = randomAlphabet();
		// var a = randomSpeed(50);
		// alert(a)
		
		var a = new MovingText();
		setInterval(function(){
			a.move();
		},100);
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
</body>
</html>