<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		var data = ["a","b","c","d","e"];
		$("#btn").click(function(){ // 버튼에 이벤트를 걸음. 눌렀을때 함수 작동 
			var str = "<ul>";
			$.each(data, function(idx,item){ // jquery의 반복문. 두번째 매개변수는 함수. data의 내용만큼 함수를 실행해라. idx:배열의 인덱스, item:배열의 내용. idx랑 item은 마음대로 지어도됨
				str += "<li>"+item+"</li>";
			}); 
			str += "</ul>";
			$("#result").html(str); // html에 str을 넣어줌
		}); 
	});
</script>
</head>
<body>
	<button id="btn">노드생성</button>
	<hr>
	<div id="result"></div>
</body>
</html>