<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	window.onload = function(){
		var newsList = [{title:"뉴스1", url:"naver.com", content:"네이버"},
			{title:"뉴스2", url:"https://daum.net", content:"다음"},
			{title:"뉴스3", url:"https://google.co.kr", content:"구글"},
			{title:"뉴스4", url:"https://map.naver.com", content:"네이버맵"},
			{title:"뉴스5", url:"https://translate.google.co.kr", content:"구글번역기"}];
		for(var i = 0; i < newsList.length; i++){
			var li = document.createElement("li");
			var news = newsList[i];
			var text = document.createTextNode(news.title);
			li.appendChild(text);
			li.setAttribute("idx",i);
			document.getElementsByTagName("ul")[0].appendChild(li);
			
			li.onmouseover = function(){
				var idx = this.getAttribute("idx");
				document.getElementById("content").value = newsList[idx].content; // 입력하는 양식이니 value
			}
		}
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>주요 뉴스</h2>
	<ul></ul>
	<textarea rows="10" cols="80" id="content"></textarea>
</body>
</html>