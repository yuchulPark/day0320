<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	var goods = {
		no:1, item:"옷", price:10000, qty:10, fname:"cloth5.jpg", detail:"좋은 옷입니다."	
	};
	window.onload = function(){
		document.getElementById("btn").onclick = function(){
			document.getElementById("no").innerHTML = goods.no;
			document.getElementById("item").innerHTML = goods.item;
			document.getElementById("price").innerHTML = goods.price;
			document.getElementById("qty").innerHTML = goods.qty;
			document.getElementById("fname").src = goods.fname;
			document.getElementById("detail").innerHTML = goods.detail;
		}
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	상품번호 : <span id="no"></span><br>
	상품명 : <span id="item"></span><br>
	가격 : <span id="price"></span><br>
	수량 : <span id="qty"></span><br>
	첨부파일 : <img id="fname"><br>
	상세설명 : <br><textarea rows="10" cols="80" id="detail"></textarea>
	<button id="btn">상품정보 출력</button>
</body>
</html>