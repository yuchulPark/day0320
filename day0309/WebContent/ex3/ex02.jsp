<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		 // JSON (JavaScript Object Notation : 자바스크립트 객체 표기법)
		var arr = [{name:"옷1", fname:"cloth1.jpg"},{name:"옷2",fname:"cloth2.jpg"},{name:"옷3",fname:"cloth3.jpg"},{name:"옷4",fname:"cloth4.jpg"},{name:"옷5",fname:"cloth5.jpg"}];
		document.getElementById("btn").onclick = function(){
			for(var i = 0; i < arr.length; i++){
				var g = arr[i]; // g는 객체. name도 있고 fname이 있음
				var text = document.createTextNode(g.name); // g['name']라고 써도 됨
				var li = document.createElement("li");
				li.setAttribute("idx", i); // 속성을 부여
				li.appendChild(text);
				
				document.getElementById("list").appendChild(li);
				
				li.onclick = function(){
					var fname = arr[this.getAttribute("idx")].fname;
					document.getElementById("img").src = fname;
				}
			}
		}
	}
</script>
</head>
<body>
	<ul id="list"></ul>
	<button id="btn">상품 목록 읽어오기</button>
	<img id="img">
</body>
</html>