<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#addLast").click(function(){
			$("<h2></h2>").html("이순신").appendTo("#div") // id가 div인 부모를 찾아서 이순신을 넣음
		})
		$("#addFirst").click(function(){
			$("<h2></h2>").html("이순신").prependTo("#div") // prepend, prependTo : 맨 앞에 추가
		})
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="div">
		<h2>홍길동</h2>
		<h2>홍길동</h2>
		<h2>홍길동</h2>
	</div>
	<button id="addLast">맨뒤에 추가</button>
	<button id="addFirst">맨앞에 추가</button>
</body>
</html>