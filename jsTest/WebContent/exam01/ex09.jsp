<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){ // 윈도우가 다 만들어지고 동작하도록 함
		var data = ["행복","돈","소신","휴식","건강","가족"]; // 자바스크립트의 배열
		
		document.getElementById("btn").onclick = function(){
			var r = "";
			r += "<ul>";
			for(i = 0; i < data.length; i++)
				r += "<li>" + data[i] + "</li>";
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