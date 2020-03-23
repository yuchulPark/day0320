<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		var arr = document.getElementsByTagName("li");
		for(var i=0; i<arr.length; i++){
			arr[i].ondblclick = function(){
				this.parentNode.removeChild(this); 
				// document.getElementsByTagName("ul")[0].removeChild(this); 도 가능
			}
		}
	}
</script>
</head>
<body>
	<h2>직장인이 선호하는 점심메뉴</h2>
	<ul>
		<li>짬뽕</li>
		<li>짜장</li>
		<li>밥</li>
		<li>김치</li>
		<li>죽</li>
	</ul>
</body>
</html>