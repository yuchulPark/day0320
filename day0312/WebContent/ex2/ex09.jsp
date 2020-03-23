<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		// $("#a h1").css("color", "red");
		$("button").click(function(){
			var select = "#" + $(this).text(); // 밑에 버튼에서 a > h1이 안되는데 $(this).html()말고 $(this).text()로 하면 됨
			$(select).css("color", "red");
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
	<button>a > h1</button>
	<button>b > h1</button>
	<button>a *</button>
	<button>b *</button>
</body>
</html>