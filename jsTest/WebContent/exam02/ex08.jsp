<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("btn").onclick = function(){
			var n = eval(document.getElementById("n").value);
			var sum = 0;
			for(i = 1; i <= n; i++){
				sum += i;
			}
			document.getElementById("result").innerHTML = sum;
		}
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	어디까지 더할까요? <input type="number" id="n">
	<input type="button" id="btn" value="더하기">
	<hr>
	결과 : <span id="result"></span>
</body>
</html>