<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btnAdd").click(function(){
			var tr = $("<tr></tr>");
			var td1 = $("<td></td>").text($("#name").val()); // .html()써도 됨. 첫번째 td를 만들음
			var td2 = $("<td></td>").text($("#kor").val());
			var td3 = $("<td></td>").text($("#eng").val());
			var td4 = $("<td></td>").text($("#math").val());
			$(tr).append(td1,td2,td3,td4);
			$("#table").append(tr);
		});
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table id="table" border="1" width="80%">
		<tr>
			<td>이름</td>
			<td>국어</td>
			<td>영어</td>
			<td>수학</td>
		</tr>
	</table>
	<hr>
	이름 : <input type="text" id="name"><br>
	국어 : <input type="number" id="kor"><br>
	영어 : <input type="number" id="eng"><br>
	수학 : <input type="number" id="math"><br>
	<button id="btnAdd">등록</button>
</body>
</html>