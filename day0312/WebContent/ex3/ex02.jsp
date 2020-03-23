<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btnSet").click(function(){
			$("#name").val("홍길동"); // 매개변수가 있으면 설정하기. val : 입력할 때 사용. html or text : 꺼내올 때 사용
		});
		$("#btnRead").click(function(){
			var name = $("#name").val(); // 매개변수가 없으면 읽어오기
			alert(name)
		});
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<input type="text" id="name"><br>
	<input type="button" value="설정하기" id="btnSet">
	<input type="button" value="읽어오기" id="btnRead">
</body>
</html>