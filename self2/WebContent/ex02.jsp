<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function add(){
		var n11 = eval(document.A.n1.value);
		var n22 = eval(document.A.n2.value); // eval : 계산이 가능한 상태로 만들어줌
		var r = n11 + n22;
		document.getElementById("result").innerHTML = r;
	}
</script>
</head>
<body>
	<form name="A">
		수1 : <input type="text" name="n1"><br>
		수2 : <input type="text" name="n2"><br>
			<input type="button" value="더하기" onclick="add()"><br>
		결과 : <span id="result"></span>
	</form>
</body>
</html>