<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("joinForm").onsubmit = function(){
			var id = document.getElementById("id").value
			var pwd = document.getElementById("pwd").value
			var pwdCheck = document.getElementById("pwdCheck").value
			var name = document.getElementById("name").value
			var age = document.getElementById("age").value
			
			if(id.length < 6){
				alert("아이디는 6자 이상으로 입력해주세요.");
				return false;
			}
			if(name.length < 2){
				alert("이름은 2글자 이상이어야 합니다.");
				return false;
			}
			if(pwd.length < 8){
				alert("암호는 8자 이상으로 입력해주세요.");
				return false;
			}
			if(pwd != pwdCheck){
				alert("암호와 암호 확인이 일치하지 않습니다.");
				return false;
			}
			if(age == "" || isNaN(age)){ // 너 숫자가 아니야? (글자야?)
				alert("나이는 숫자로 입력하세요.");
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
		아이디 : <input type="text" name="id" id="id"><br>
		암호 : <input type="password" name="pwd" id="pwd"><br>
		암호 확인 : <input type="password" id="pwdCheck"><br>
		이름 : <input type="text" name="name" id="name"><br>
		나이 : <input type="number" name="age" id="age"><br>
			<input type="submit" value="가입">
	</form>
</body>
</html>