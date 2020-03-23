<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("btnAdd").onclick = function(){
			var name = document.createTextNode(document.getElementById("name").value);
			var kor = document.createTextNode(document.getElementById("kor").value);
			var eng = document.createTextNode(document.getElementById("eng").value);
			var math = document.createTextNode(document.getElementById("math").value);
			
			var td1 = document.createElement("td");
			var td2 = document.createElement("td");
			var td3 = document.createElement("td");
			var td4 = document.createElement("td");
			
			td1.appendChild(name);
			td2.appendChild(kor);
			td3.appendChild(eng);
			td4.appendChild(math);
			
			var tr = document.createElement("tr");
			tr.appendChild(td1);
			tr.appendChild(td2);
			tr.appendChild(td3);
			tr.appendChild(td4);
			
			document.getElementById("table").appendChild(tr);
		}
	}
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