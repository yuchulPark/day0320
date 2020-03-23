<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	.active{
		background: yellow;
	}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			var arr;
			var today = new Date();
			$.ajax("GoodsServlet?a="+today, {success:function(data){
				arr = data;
				// var arr = eval("(" + data + ")")
				
				$.each(arr, function(idx, d){
					var td1 = $("<td></td>").html(d.no)
					var td2 = $("<td></td>").html(d.item)
					var tr = $("<tr></tr>").attr("idx",idx)
					tr.append(td1, td2)
					$("#tb").append(tr)
					
					$(tr).click(function(){
						$("tr").removeClass("active")
						$(this).addClass("active")
						
						var idx = $(this).attr("idx")
						var goods = arr[idx]
						$("#img").attr("src",goods.fname)
						$("#no").html(goods.no)
						$("#item").html(goods.item)
						$("#qty").html(goods.qty)
						$("#price").html(goods.price)
						$("#detail").html(goods.detail)
					})
				})
			}})
		})
	})
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table id="tb" width="80%" border="1">
		<tr>
			<td>상품번호</td>
			<td>상품명</td>
		</tr>
	</table>
	<button id="btn">상품정보 읽어오기</button>
	<br>
	<table>
		<tr>
			<td>
				<img id="img" src="">
			</td>
			<td>
				상품번호 : <span id="no"></span><br>
				상품명 : <span id="item"></span><br>
				수량 : <span id="qty"></span><br>
				가격 : <span id="price"></span><br>
				상세설명 : <span id="detail"></span>
			</td>
		</tr>
	</table>
</body>
</html>