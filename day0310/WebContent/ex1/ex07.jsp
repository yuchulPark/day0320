<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		var arr = [{no:1,name:"스타킹1",qty:1,price:100,fname:"stock1.jpg"},
				{no:2,name:"스타킹2",qty:2,price:200,fname:"stock2.jpg"},
				{no:3,name:"스타킹3",qty:3,price:300,fname:"stock3.jpg"},
				{no:4,name:"스타킹4",qty:4,price:400,fname:"stock4.jpg"},
				{no:5,name:"스타킹5",qty:5,price:500,fname:"stock5.jpg"}];
		var btn = document.getElementsByTagName("button");
		btn[0].onclick = function(){
			for(var i = 0; i < arr.length; i++){
				var tr = document.createElement("tr");
				var g = arr[i];
				for(var a in g){ // 속성을 하나씩 꺼내옴
					var td = document.createElement("td");
					if(a == "fname"){
						var img = document.createElement("img");
						img.src = g[a];
						img.width = 100;
						img.height = 100;
						td.appendChild(img);
					}else{
						var text = document.createTextNode(g[a]);
						td.appendChild(text);
					}
					tr.appendChild(td);
				}
				document.getElementsByTagName("table")[0].appendChild(tr);
			}
		}
	}
</script>
</head>
<body>
	<h2>장바구니 목록</h2>
	<table border="1" width="80%">
		<tr>
			<td>상품번호</td>
			<td>상품명</td>
			<td>수량</td>
			<td>가격</td>
			<td>사진</td>
		</tr>
	</table>
	<button>장바구니 목록 읽어오기</button>
</body>
</html>