<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			$.ajax("member.jsp",{success:function(data){ // data는 객체가 아닌 string
				var member = eval("("+data+")"); // 객체로 만드는 과정
				var h2 = $("<h2></h2>").html(member.name)
				var p = $("<p></p>").html(member.age)
				$("#result").append(h2, p)
			}})
		})
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="result"></div>
	<button id="btn">회원정보 읽어오기</button>
</body>
</html>