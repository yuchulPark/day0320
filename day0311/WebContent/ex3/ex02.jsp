<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("myForm").onsubmit = function(){
			var pwd = document.getElementById("pwd").value;
			var pwdCheck = document.getElementById("pwdCheck").value;
			if(pwd != pwdCheck){ 
				alert("암호가 서로 다릅니다.");
				return false; // 못가게하고 여기 머물러 있게함
			}
			if(pwd == ""){ // null은 안됨
				alert("암호를 입력하세요.");
				return false;
			}
		}
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form id="myForm" action="hello.jsp" method="post">
		암호 : <input type="password" id="pwd"><br>
		암호 확인 : <input type="password" id="pwdCheck"><br>
		<input type="submit" value="확인">
	</form>
</body>
</html>