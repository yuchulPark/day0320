<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("btn").onclick = function() {
			var tr = document.createElement("tr");
			var input = document.getElementsByTagName("input");
			var sum = 0;
			for(var i = 0; i < input.length; i++){
				var td = document.createElement("td");
				var text = document.createTextNode(input[i].value);
				td.appendChild(text);
				tr.appendChild(td);
				if(i != 0){
					sum += eval(input[i].value);
				}
			}
			var textSum = document.createTextNode(sum);
			var textAvg = document.createTextNode(sum/3);
			var tdSum = document.createElement("td");
			var tdAvg = document.createElement("td");
			tdSum.appendChild(textSum);
			tdAvg.appendChild(textAvg);
			tr.appendChild(tdSum);
			tr.appendChild(tdAvg);
			
			document.getElementById("list").appendChild(tr);
			
			for(var i in input){
				input[i].value = "";
			}
		}
	}
</script>
</head>
<body>
	<table id="list" border="1" width="80%">
		<tr>
			<td id="name">이름</td>
			<td id="kor">국어</td>
			<td id="eng">영어</td>
			<td id="math">수학</td>
			<td>총점</td>
			<td>평균</td>
		</tr>
	</table>
	이름 : <input type="text"><br>
	국어 : <input type="text"><br>
	영어 : <input type="text"><br>
	수학 : <input type="text"><br>
	<button id="btn">등록</button>
</body>
</html>