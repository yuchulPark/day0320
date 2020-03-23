<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	.highlight{
		background:yellow;
	}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$(".member").hover(function(){ // hover : 마우스 올라가고 나가는 이벤트 처리
			$(this).addClass("highlight");
		}, function(){
			$(this).removeClass("highlight");
		}); 
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="80%">
		<tr><td>이름</td><td>국어</td><td>영어</td><td>수학</td></tr>
		<tr class="member"><td>홍</td><td>1</td><td>1</td><td>1</td></tr>
		<tr class="member"><td>김</td><td>2</td><td>2</td><td>2</td></tr>
		<tr class="member"><td>이</td><td>3</td><td>3</td><td>3</td></tr>
		<tr class="member"><td>박</td><td>4</td><td>4</td><td>4</td></tr>
	</table>
</body>
</html>