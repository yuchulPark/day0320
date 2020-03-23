<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	window.onload = function(){
		var btnApple = document.getElementById("btnApple");
		var btnGrape = document.getElementById("btnGrape");
		var cntApple = document.getElementById("cntApple");
		var cntGrape = document.getElementById("cntGrape");
		var appleCount = 0;
		var grapeCount = 0;
		
		btnApple.onclick = function(){
			appleCount++;
			cntApple.innerHTML = appleCount;
			// btnGrape.onclick(); // 사과 버튼을 누르면 포도의 개수도 같이 증가
		}
		btnGrape.onclick = function(){
			grapeCount++;
			cntGrape.innerHTML = grapeCount;
		}
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<button id="btnApple">사과</button>
	<button id="btnGrape">포도</button>
	<h1>사과 수량 : <span id="cntApple"></span></h1>
	<h1>포도 수량 : <span id="cntGrape"></span></h1>
</body>
</html>