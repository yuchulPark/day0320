<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	function add(){
		var n11 = eval(document.F.n1.value); // var는 써도되고 안써도된다.
		var n22 = eval(document.F.n2.value); // eval : 계산이 가능한 상태로 만들어줌
		var r = n11 + n22;
		document.getElementById("result").innerHTML = r;
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="F">
		수1 : <input type="number" name="n1"><br>
		수2 : <input type="number" name="n2"><br>
			<input type="button" value="더하기" onclick="add()"><br>
		결과 : <span id="result"></span>
	</form>
</body>
</html>