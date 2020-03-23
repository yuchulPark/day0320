<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("button").click(function(){
			// $("body *").css("color", "white");
			var sel = "#" + $(this).attr("sel"); // 속성을 가져옴
			$(sel).css("color","red");
		});
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="a">
		<h1>A입니다.</h1>
		<div id="ap">
			<h1 id="aph1">홍길동</h1>
			<h2 id="aph2">서울</h2>
		</div>
	</div>
	<div id="b">
		<h1>B입니다.</h1>
		<div id="bp">
			<h1 id="bph1">이순신</h1>
			<h2 id="bph2">인천</h2>
		</div>
	</div>
	<button sel="a > h1">a의 자식중에 h1</button> <!-- 프로그램 하려고 임의의 sel 속성을 씀 (자스에 원래 있던 속성이 아님) -->
	<button sel="b > h1">b의 자식중에 h1</button>
	<button sel="a *">a의 후손 모두</button>
	<button sel="b *">b의 후손 모두</button>
</body>
</html>