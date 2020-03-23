<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("btn").onclick = function(){
			var item = document.getElementById("item").value;
			var li = document.createElement("li"); // li 노드를 만들어주세요.
			var txt = document.createTextNode(item); // li에 들어갈 텍스트노드를 만듬
			li.appendChild(txt); // txt에 있는 글자를 li에 넣어야함
			document.getElementById("list").appendChild(li);
		}
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>인생에서 중요하게 여기는 것</h2>
	<ul id="list"></ul>
	<input type="text" id="item"><br>
	<button id="btn">입력</button>	
</body>
</html>