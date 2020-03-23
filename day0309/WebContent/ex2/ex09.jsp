<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		var selli;
		var input = document.getElementById("input");
		
		document.getElementById("btn").onclick = function(){ // 추가
			var str = document.getElementById("input").value;
			var text = document.createTextNode(str);
			var li = document.createElement("li");
			li.appendChild(text);
			document.getElementById("list").appendChild(li);
			
			li.onclick = function(){
				input.value = this.innerHTML; // 눌렀을때 text창에 나오도록함
				
				var liList = document.getElementsByTagName("li");
				for(var i = 0; i < liList.length; i++){
					liList[i].style.background = "white";
				}
				selli = this;
				this.style.background = "yellow";
			}
		}
		document.getElementById("update").onclick = function(){ // 수정
			selli.innerHTML = input.value;
		}
		document.getElementById("delete").onclick = function(){ // 삭제
			// document.getElementById("list").removeChild(selli);
			selli.parentNode.removeChild(selli); // 이렇게 해도 됨
		}
	}
</script>
</head>
<body>
	<h2>직장인이 좋아하는 점심메뉴</h2>
	<ul id="list">
	</ul>
	<input type="text" id="input"><br>
	<button id="btn">등록</button>
	<button id="update">수정</button>
	<button id="delete">삭제</button>
</body>
</html>