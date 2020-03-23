<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	window.onload = function(){
		var today = new Date();
		var h = today.getHours();
		if(h <= 17){
			document.getElementById("m").src = "sun.jpg";
		}
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<img src="moon.jpg" id="m">
</body>
</html>