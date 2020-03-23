<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	window.onload = function(){
		setInterval(function(){ // 앞에는 응답할 함수, 뒤에는 초  
			var today = new Date();
			document.getElementById("result").innerHTML = today;
		},1000); 
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	현재 시간 : <span id="result"></span>
</body>
</html>