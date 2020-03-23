<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){ //
		var btn = document.getElementById("btn"); // id가 btn인 노드를 찾아서 변수 btn애 담음. btn은 객체가 됨
		btn.onclick = function() { // 버튼이 눌리어지는 이벤트 설정
			var h1 = document.createElement("h1"); // h1 태그를 하나 만들음
			var text = document.createTextNode("안녕"); // 위에서 만든 h1 노드에 들어갈 글자를 만들음
			h1.appendChild(text); // h1 노드에 글자 노드를 담음. 부모.appendChild
			document.getElementById("result").appendChild(h1); // id가 result인 노드를 찾아서 h1 노드에 담음
 		}
	}
	</script>
</head>
<body>
	<div id="result"></div> <!-- 동적으로 태그를 만들어 담을 공간을 만들고 id 설정 -->
	<button id="btn">노드추가</button>
</body>
</html>