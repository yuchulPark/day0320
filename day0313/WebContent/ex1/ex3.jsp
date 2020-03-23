<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btnSet").click(function(){
			$("img").attr("src","stock4.jpg"); // 전부 다 이걸로 바뀜
		})
		$("#btnGet").click(function(){
			// var src = $("img").attr("src") // 맨 첫번째꺼만 읽어옴
			// alert(src) // 배열에 담을려면 루프를 돌면서 담아야함
			
			var arr = [];
			$("img").each(function(idx, item){
				arr.push($(this).attr("src"));
			})
			// 배열에 담겼는지 보는거 (반복문 또 사용)
			$.each(arr, function(idx, s){
				alert(s)
			})
		})
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<img src="stock1.jpg" width="100" height="100">
	<img src="stock2.jpg" width="100" height="100">
	<img src="stock3.jpg" width="100" height="100">
	<button id="btnSet">설정하기</button>
	<button id="btnGet">읽어오기</button>
</body>
</html>