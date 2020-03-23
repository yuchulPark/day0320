<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	.active{
		background:pink;
	}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		var selH2; 
		
		$("h2").dblclick(function(){
			$(this).remove();
		})
		$("#btnAdd1").click(function(){
			var h2 = $("<h2></h2>").html($("#input").val());
			$(h2).click(function(){
				$("h2").removeClass("active");
				$(this).addClass("active");
			})
			$("#team1").append(h2);
			
			$("h2").dblclick(function(){ // 위에꺼 붙여넣기
				$(this).remove();
			})
		})
		$("#btnAdd2").click(function(){
			var h2 = $("<h2></h2>").html($("#input").val());
			$(h2).click(function(){ // 위에꺼 복사붙여넣기
				$("h2").removeClass("active");
				$(this).addClass("active");
			})
			$("#team2").append(h2);
			
			$("h2").dblclick(function(){ // 위에꺼 붙여넣기
				$(this).remove();
			})
		})		
		$("h2").click(function(){
			$("h2").removeClass("active");
			$(this).addClass("active");
			selH2 = $(this);
			$("#input").val($(this).html());
		})
		$("#btnUpdate").click(function(){
			$(selH2).html($("#input").val());
		})
		$("#btnDel1").dblclick(function(){
			$("#team1").empty();
		})
		$("#btnDel2").dblclick(function(){
			$("#team2").empty();
		})
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>팀1의 구성원</h1>
	<div id="team1">
		<h2>이순신</h2>
		<h2>유관순</h2>
		<h2>홍길동</h2>
	</div>
	<hr>
	<h1>팀2의 구성원</h2>
	<div id="team2">
		<h2>강감찬</h2>
		<h2>을지문덕</h2>
		<h2>대조영</h2>
	</div>
	<input type="text" id="input">
	<button id="btnAdd1">팀1추가</button>
	<button id="btnAdd2">팀2추가</button>
	<button id="btnUpdate">수정</button><br>
	<button id="btnDel1">팀1 삭제</button>
	<button id="btnDel2">팀2 삭제</button>
</body>
</html>