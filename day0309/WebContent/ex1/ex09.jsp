<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		var data = ["java","oracle","java script","spring"];
		document.getElementById("btn").onclick = function(){
			var arr = document.getElementsByTagName("h1"); // h1 태그를 모두 찾아달라는 뜻. 배열을 반환함
			for(var i in arr){ // for(var i = 0; i < arr.length; i++)랑 같은 표현
				arr[i].innerHTML = data[i];
			}
		}
	}
</script>
</head>
<body>
	<h1>자바</h1>
	<h1>오라클</h1>
	<h1>자바스크립트</h1>
	<h1>스프링</h1>
	<button id="btn">영어로 바꾸기</button>
</body>
</html>