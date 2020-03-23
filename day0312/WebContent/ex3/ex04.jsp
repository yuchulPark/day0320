<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		setTimeout(function(){
			var str = $("select > option:selected").val(); // select된것 중 option에서 selected된것의 밸류값을 뿌려줘
			alert(str)
		},2000);
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<select>
		<option>사과</option>
		<option>포도</option>
		<option>오렌지</option>
		<option>수박</option>
		<option>딸기</option>
	</select>
</body>
</html>