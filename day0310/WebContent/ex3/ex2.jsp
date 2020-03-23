<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="bit.js"></script>
<script type="text/javascript">
	window.onload = function(){
		var arr = []; // 빈배열 만들기
		for(var i = 0; i < 100; i++){
			arr.push(new MovingText()); // push : 비어있는 배열에 데이터를 추가해달라는 함수
		}
		setInterval(function(){
			for(var i = 0; i < arr.length; i++){
				arr[i].move();
			}
		},100);
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
</body>
</html>