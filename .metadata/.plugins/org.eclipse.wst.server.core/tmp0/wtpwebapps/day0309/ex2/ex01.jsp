<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("btn").onclick = function(){
			var arr = ["박유철",20,"인천","010-1111-1111"];
			var td = document.getElementsByTagName("td");
			for(var i in td){
				td[i].innerHTML = arr[i];
			}
		}
	}
</script>
</head>
<body>
	<table border="1" width="80%">
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
	</table>
	<button id="btn">데이터 출력</button>
</body>
</html>