<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("button").click(function(){
			$("*").css("color","blue");
			$(this).css("color","black"); // 버튼도 파란색으로 바뀌는걸 방지함
		});
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>홍길동</h2>
	<h4>서울</h4>
	<h2>유관순</h2>
	<h4>전주</h4>
	<h2>강감찬</h2>
	<h4>인천</h4>
	<button id="btn">모두 파란색</button>
</body>
</html>