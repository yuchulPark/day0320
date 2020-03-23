<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("btn").onclick = function(){
			var img = document.createElement("img");
			//img.src = "logo.jpg";
			//img.width = 100;
			//img.height = 100;
			img.setAttribute("src", "logo.jpg") // 다음과 같이도 가능하다. 
			img.setAttribute("width", 100)
			img.setAttribute("height", 100) // 구별할 목적으로 속성을 부여할때 setAttribute를 사용
			document.getElementById("result").appendChild(img)
		}
	}
</script>
</head>
<body>
	<div id="result"></div>
	<button id="btn">이미지 노드 추가</button>
</body>
</html>