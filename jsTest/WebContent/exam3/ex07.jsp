<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	var arr = [
		{name:"홍길동",kor:100,math:100,eng:90},
		{name:"홍길은",kor:80,math:50,eng:100},
		{name:"홍길금",kor:70,math:60,eng:90}
	];
	window.onload = function(){
		document.getElementById("btn").onclick = function(){
			var str = "<table>";
			for(i = 0; i < arr.length; i++){
				var student = arr[i]; // student는 객체
				str += "<tr>";
				str += "<td>"+student.name+"</td>";
				str += "<td>"+student.kor+"</td>";
				str += "<td>"+student.math+"</td>";
				str += "<td>"+student.eng+"</td>";
				str += "</tr>";
			}
			str += "</table>";
			document.getElementById("result").innerHTML = str;
		}
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>학생 정보 출력</h2>
	<div id="result"></div>
	
	<button id="btn">출력</button>
</body>
</html>