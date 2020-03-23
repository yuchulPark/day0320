<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			var arr = $("input[type=text]"); // 요소:text도 가능
			$.each(arr, function(idx, input){ // jquery 반복문 
				alert($(this).val());
				// alert(idx) => 0 1 2 라고 출력됨
				// alert(input)
			}); 
		});
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	이름 : <input type="text"><br>
	주소 : <input type="text"><br>
	전화 : <input type="text"><br>
		<input id="btn" type="button" value="확인">
</body>
</html>