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
			var str = "";
			str += "<ul>";
			str += "<li>javascript</li>";
			str += "<li>jquery</li>"
			str += "<li>ajax</li>"
			str += "</ul>";
			document.getElementById("result").innerHTML = str;
		}
	}
</script>
</head>
<body>
	<div id="result"></div>
	<button id="btn">리스트 노드 추가</button>
</body>
</html>