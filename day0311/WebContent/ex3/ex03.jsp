<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("a").onclick = function(){
			this.style.color = "red";
			this.style.background = "blue";
			// 일처리를 하고 보내고 싶어함
			return false;
		}
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a id="a" href="hello.jsp">안녕</a>
</body>
</html>