<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	var newsList = ["다음주부터 1주일간 코로나19로 인하여 휴강입니다. 모두 집에서 안전하게 잡시다.",
				"크리드바이레도메종프란시스커정",
				"바이킬리안세르주루텐그라트시엘디올라콜렉션프리베아르마니프리베",
				"아틀리에코롱조말련딥티크메모아무아쥐클라이브크리스챤"];
	window.onload = function(){
		var row = 0;
		var i = 1;
		setInterval(function(){
			var news = newsList[row];
			var str = news.substr(0,i);
			i++;
			if(i >= news.length){
				i = 1;
				row++;
			}
			if(row >= newsList.length){
				i = 1;
				row = 0;
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