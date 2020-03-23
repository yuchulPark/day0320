<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			var input = $('input[type=text]'); // type이 text인 input만 적용
			// var input = $('input'); 이렇게 하면 버튼까지도 '입력하세요.' 라는 문구가 나옴
			$(input).val("입력하세요.");
		});
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	이름 : <input type="text"><br>
	주소 : <input type="text"><br>
		<input id="btn" type="button" value="확인">
</body>
</html>