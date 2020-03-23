<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btnAdd").click(function(){
			$("h2").attr("dataIndex", function(idx){
				return idx; // 0, 1, 2값이 idx에 들어감, 크롬 개발자도구에서 확인해보기
			})
		})
		$("#btnRemove").click(function(){
			$("h2").removeAttr("dataIndex"); // 크롬 개발자도구에서 확인해보기
		})
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>홍길동</h2>
	<h2>이순신</h2>
	<h2>유관순</h2>
	<button id="btnAdd">속성 추가</button>
	<button id="btnRemove">속성 제거</button>
</body>
</html>