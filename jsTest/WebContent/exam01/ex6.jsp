<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script type="text/javascript">
		$(function (){
			$("#btnMax").click(function(){ // 이벤트 거는거
				x = eval($("#n1").val());
				y = eval($("#n2").val());
				r = x;
				if(y > x){
					r = y;
				}
				$("#result").html(r);
			}); 
		});
	</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
		수1 : <input type="number" id="n1"><br>
		수2 : <input type="number" id="n2"><br>
			<input type="button" value="큰수 확인" id="btnMax"><br>
		결과 : <span id="result"></span>

</body>
</html>