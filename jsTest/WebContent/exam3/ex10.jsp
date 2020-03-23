<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	var news = "다음주부터 1주일간 코로나19로 인하여 휴강입니다. 모두 집에서 안전하게 잡시다.";
	
	window.onload = function(){
		var i = 1;
		setInterval(function(){
			var str = news.substr(0,i);
			i++;
			if(i >= news.length){
				i = 1;
			}
			document.getElementById("result").innerHTML = str;
		},100);
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	오늘의 뉴스 : <span id="result"></span>
</body>
</html>