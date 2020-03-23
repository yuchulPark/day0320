<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	window.onload = function(){
		var menuImg = ["mn.png","mn2.png","mn3.png"];
		var menuImgUp = ["sun.jpg","moon.jpg","earth.jpg"];
		
		var menu = document.getElementsByClassName("menu");
		for(var i = 0; i < menu.length; i++){
			menu[i].setAttribute("idx",i); // 속성을 주고 이벤트를 걸어야함
			menu[i].onmouseover = function(){
				var idx = this.getAttribute("idx");
				this.src = menuImgUp[idx];
			}
			menu[i].onmouseleave = function(){
				var idx = this.getAttribute("idx");
				this.src = menuImg[idx];
			}
		}
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<img class="menu" src="mn.png">
	<img class="menu" src="mn2.png">
	<img class="menu" src="mn3.png">
</body>
</html>