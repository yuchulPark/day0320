<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		var arr = [{no:1,name:"스타킹1",price:100,qty:1,fname:"stock1.jpg"},
			{no:2,name:"스타킹2",price:200,qty:2,fname:"stock2.jpg"},
			{no:3,name:"스타킹3",price:300,qty:3,fname:"stock3.jpg"},
			{no:4,name:"스타킹4",price:400,qty:4,fname:"stock4.jpg"},
			{no:5,name:"스타킹5",price:500,qty:5,fname:"stock5.jpg"}];
		$.each(arr, function(idx, item){
			var li = $("<li></li>").html("<h2>" + item.no+" => "+item.name + "</h2>")
			$(li).attr("idx",idx)
			$("#ul").append(li);
			
			li.click(function(){
				var idx = $(this).attr("idx")
				var g = arr[idx]
				
				$("#img").attr("src",g.fname) // attr : w속성을 지정해주는 함수
				$("#no").html(g.no)
				$("#name").html(g.name)
				$("#qty").html(g.qty)
				$("#price").html(g.price)				
			})
		})
	})
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul id="ul"></ul>
	<table>
		<tr>
			<td><img id="img" width="100" height="100"></td>
			<td>
				<p id="no"></p>
				<p id="name"></p>
				<p id="qty"></p>
				<p id="price"></p>
			</td>
		</tr>
	</table>
</body>
</html>