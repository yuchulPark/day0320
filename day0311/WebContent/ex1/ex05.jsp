<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
window.onload = function(){
	var trList = document.getElementsByTagName("tr");
		for(var i = 0; i < trList.length; i++){
			if(i != 0){
				trList[i].onmouseover = function(){
					this.style.background = "red";
				}
				trList[i].onmouseleave = function(){
					this.style.background = "white";
				}
			}
		}
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="80%">
		<tr bgcolor="pink"><td>이름</td><td>나이</td><td>지역</td><td>전화번호</td></tr>
		<tr><td>김</td><td>20</td><td>서울</td><td>010-1111-1111</td></tr>
		<tr><td>이</td><td>21</td><td>인천</td><td>010-2222-2222</td></tr>
		<tr><td>박</td><td>22</td><td>수원</td><td>010-3333-3333</td></tr>
		<tr><td>최</td><td>23</td><td>부산</td><td>010-5555-5555</td></tr>
		<tr><td>한</td><td>24</td><td>대구</td><td>010-7777-7777</td></tr>
	</table>
</body>
</html>