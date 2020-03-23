<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		var arr = ["cloth1.jpg","cloth2.jpg","cloth3.jpg","cloth4.jpg","cloth5.jpg"];
		document.getElementById("btn").onclick = function(){
				var img = document.getElementsByTagName("img");
				for(var i in img){
				img[i].src = arr[i];
				img[i].width = 150;
				img[i].height = 150;
			}
		}
	}
</script>
</head>
<body>
	<img>
	<img>
	<img>
	<img>
	<img>
	<button id="btn">이미지 읽어오기</button>
</body>
</html>