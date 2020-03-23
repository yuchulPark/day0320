<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("btn").onclick = function() {
			var str = "";
			for(var i in window) { // window는 자스가 제공해주는 객체
				str += i + "===>" + window[i] + "\n";
			}
			document.getElementById("result").value = str;
		}
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<button id="btn">윈도우 속성 알아보기</button><br>
	<textarea rows="20" cols="80" id="result"></textarea>
</body>
</html>