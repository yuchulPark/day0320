<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("btn").onclick = function(){
			var h1 = document.createElement("h1");
			var text = document.createTextNode("hello");
			h1.appendChild(text);
			document.getElementById("result").appendChild(h1);
			this.onclick = null; // 위에만 발생하고 이제 이벤트 발생 안시킬거임. 이벤트 제거
		}
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="result"></div>
	<button id="btn">노드 추가</button>
</body>
</html>