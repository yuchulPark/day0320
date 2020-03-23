<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	function bymax(){
		var x = eval(document.A.n1.value);
		var y = eval(document.A.n2.value);
		var z = x;
		if(x < y){
			z = y;
		}
		document.getElementById("result").innerHTML = z;
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="A">
		수1 : <input type="number" name="n1"><br>
		수2 : <input type="number" name="n2"><br>
			<input type="button" value="큰수 확인" onclick="bymax()"><br>
		결과 : <span id="result"></span>
	</form>
</body>
</html>