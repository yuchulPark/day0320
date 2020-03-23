<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	.highlight{
		background:yellow;
	}
	.active{
		background:red;
	}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("li").hover(function(){
			$(this).addClass("highlight");
		}, function(){
			$(this).removeClass("highlight");
		});
		$("li").click(function(){
			$("li").removeClass("active");
			$(this).addClass("active");
			$("#result").html($(this).html());
		});
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>인생에서 중요하게 여기는 것</h2>
	<ul>
		<li>사랑</li>
		<li>권력</li>
		<li>명예</li>
		<li>돈</li>
		<li>우정</li>
	</ul>
	<span id="result"></span>
</body>
</html>