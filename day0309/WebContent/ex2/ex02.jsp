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
			var input = document.getElementById("input").value; // 값을 가지고옴
			var text = document.createTextNode(input);
			var li = document.createElement("li");
			li.appendChild(text);
			document.getElementById("list").appendChild(li);
		}
	}
</script>
</head>
<body>
	<h2>직장인이 선호하는 점심메뉴</h2>
	<ul id="list">
	</ul>
	<input type="text" id="input">
	<button id="btn">추가</button>
</body>
</html>