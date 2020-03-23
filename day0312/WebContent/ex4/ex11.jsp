<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	.highlight0{
		background:yellow;
	}
	.highlight1{
		background:orange;
	}
	.highlight2{
		background:blue;
	}
	.highlight3{
		background:pink;
	}
	.highlight4{
		background:red;
	}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("h1").each(function(idx, item){
			$(this).addClass("highlight" + idx) // this를 item으로 해도됨
		});
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사과</h1>
	<h1>포도</h1>
	<h1>오렌지</h1>
	<h1>복숭아</h1>
	<h1>수박</h1>
</body>
</html>