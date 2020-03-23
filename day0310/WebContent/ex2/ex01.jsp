<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	window.onload = function(){
		var newsList = [{title:"뉴스1", url:"naver.com"},
			{title:"뉴스2", url:"https://daum.net"},
			{title:"뉴스3", url:"https://google.co.kr"},
			{title:"뉴스4", url:"https://map.naver.com"},
			{title:"뉴스5", url:"https://translate.google.co.kr"}];
		for(var i = 0; i < newsList.length; i++){
			var li = document.createElement("li");
			var news = newsList[i];
			var text = document.createTextNode(news.title);
			var a = document.createElement("a"); // <a>태그를 만들음
			a.appendChild(text);
			a.href = news.url;
			li.appendChild(a);
			
			document.getElementsByTagName("ul")[0].appendChild(li);
		}
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>주요 뉴스</h2>
	<ul></ul>
</body>
</html>