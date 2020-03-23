<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	.border{
		border: 2px solid black;
		border-radius: 15px;
		width: 200px;
		height: 200px;
	}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		var str = "<member_list>"; // 부모노드
		str += "<member>" // 이 안에 컬럼 하나하나를 표현
		str += "<name>서동욱</name>"
		str += "<address>대만</address>"
		str += "</member>"
		
		str += "<member>" // 이 안에 컬럼 하나하나를 표현
		str += "<name>박지성</name>"
		str += "<address>영국 맨체스타</address>"
		str += "</member>"	

		str += "<member>" // 이 안에 컬럼 하나하나를 표현
		str += "<name>김연아</name>"
		str += "<address>대한민국 서울</address>"
		str += "</member>"	
		str += "</member_list>";

		var xmlDoc = $.parseXML(str); // parseXML : 글자를 xml로 변환
		var memberList = $(xmlDoc).find("member"); // member들을 찾아주세요.
		// memberList는 3개니 루프를 돌음
		$.each(memberList, function(idx, m){ // 한명 한명을 m으로 받겠습니다.
			var div = $("<div></div>").addClass("border");
			var h2 = $("<h2></h2>").html( $(this).find("name").text() ) // this를 m으로 해도됨
			var p = $("<p></p>").html( $(m).find("address").text() ) // m을 this로 해도됨
			$(div).append(h2,p); // div에 한번에 넣기
			$("body").append(div);
		})
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
</body>
</html>