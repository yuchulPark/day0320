<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	.highlight{
		background:yellow;
	}
	.active{
		background:pink;
	}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		var inputList = $("input[type=text]");
		var tdList;
		
		$("#insert").click(function(){
			var tr = $("<tr></tr>").addClass("member"); // input태그만큼 td를 만들어야함
			$.each(inputList, function(idx, item){ // tr을 루프를 돌면서 만들음
				console.log(idx);
				$(tr).append($("<td></td>").html($(item).val())); // text로 써도됨
			});
			$("#tb").append(tr);
			
			$(tr).hover(function(){
				$(this).addClass("highlight");
			}, function(){
				$(this).removeClass("highlight");
			});
		});
		
		$("#update").click(function(){
			$.each(inputList, function(idx, item){
				$(tdList[idx]).html($(this).val()); // this를 item으로 해도됨
			});
		});
		
		$(".member").hover(function(){
			$(this).addClass("highlight");
		}, function(){
			$(this).removeClass("highlight");
		});
		$(".member").click(function(){
			$(".member").removeClass("active");
			$(this).addClass("active");
			tdList = $(this).find("td");
			$.each(tdList, function(idx, td){
				$(inputList[idx]).val($(td).html()); // td를 this로 해도됨, html을 text로 해도 됨
			});
		});
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="80%" id="tb">
		<tr><td>이름</td><td>국어</td><td>영어</td><td>수학</td></tr>
		<tr class="member"><td>홍</td><td>1</td><td>1</td><td>1</td></tr>
		<tr class="member"><td>김</td><td>2</td><td>2</td><td>2</td></tr>
		<tr class="member"><td>이</td><td>3</td><td>3</td><td>3</td></tr>
		<tr class="member"><td>박</td><td>4</td><td>4</td><td>4</td></tr>
	</table>
	이름 : <input type="text"><br>
	국어 : <input type="text"><br>
	영어 : <input type="text"><br>
	수학 : <input type="text"><br>
		<input type="button" value="등록" id="insert">
		<input type="button" value="수정" id="update">
		<input type="button" value="삭제" id="delete">
</body>
</html>