<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		var data = [ "옷1", "옷2", "옷3", "옷4", "옷5" ];
		var imgData = [ "cloth1.jpg", "cloth2.jpg", "cloth3.jpg", "cloth4.jpg", "cloth5.jpg" ];
		document.getElementById("btn").onclick = function(){
			for(var i = 0; i < data.length; i++){
				var text = document.createTextNode(data[i]);
				var li = document.createElement("li");
				li.setAttribute("idx",i);
				li.appendChild(text);
				
				document.getElementById("list").appendChild(li);
				li.onclick = function(){
					var idx = this.getAttribute("idx");
					document.getElementById("img").src = imgData[idx];
				}
			}
		}
	}
</script>
</head> 
<body>
	<ul id="list"></ul>
	<button id="btn">상품목록 읽어오기</button>
	<br>
	<img id="img">
</body>
</html>