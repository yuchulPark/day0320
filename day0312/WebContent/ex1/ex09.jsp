<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("tr").mouseover(function(){
			$(this).css("background","red");
		});
		$("tr").mouseleave(function(){
			$(this).css("background","white");
		});
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="80%">
		<tr><td>홍</td><td>1</td><td>1</td><td>1</td></tr>
		<tr><td>김</td><td>2</td><td>2</td><td>2</td></tr>
		<tr><td>이</td><td>3</td><td>3</td><td>3</td></tr>
		<tr><td>박</td><td>4</td><td>4</td><td>4</td></tr>
	</table>
</body>
</html>