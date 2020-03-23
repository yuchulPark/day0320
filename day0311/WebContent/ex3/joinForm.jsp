<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("joinForm").onsubmit = function(){
			var pwd = document.getElementById("pwd").value
			var pwdCheck = document.getElementById("pwdCheck").value
			if(pwd.length < 8){
				alert("암호는 8자 이상으로 입력해주세요.");
				return false;
			}
			if(pwd != pwdCheck){
				alert("암호와 암호 확인이 일치하지 않습니다.");
				return false;
			}
		}
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원가입</h2>
	<form action="joinResult.jsp" method="post" id="joinForm">
		아이디 : <input type="text" name="id" id="id" minlength="6"><br>
		암호 : <input type="password" name="pwd" id="pwd" minlength="8"><br>
		암호 확인 : <input type="password" id="pwdCheck"><br>
		이름 : <input type="text" name="name" id="name" minlength="2"><br>
		나이 : <input type="number" name="age" id="age" min="1" max="100"><br>
			<input type="submit" value="가입">
	</form>
</body>
</html>