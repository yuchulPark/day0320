<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){ // 윈도우가 다 만들어지고 동작하도록 함
		document.getElementById("btn").onclick = function(){
			var r = "";
			r += "<ul>";
			r += "<li>행복</li>";
			r += "<li>돈</li>";
			r += "<li>소신</li>";
			r += "<li>휴식</li>";
			r += "<li>건강</li>";
			r += "</ul>";
			document.getElementById("result").innerHTML = r;
		}
	}
</script>
</head>
<body>
	<button id="btn">노드생성</button>
	<hr>
	<div id="result"></div>
</body>
</html>