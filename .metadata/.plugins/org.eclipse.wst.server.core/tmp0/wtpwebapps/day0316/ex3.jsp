<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("btn").onclick = function(){
			var request = new XMLHttpRequest();
			
			request.onreadystatechange = function(event){ // 올바르게 응답이 왔냐고 물음
				if(request.readyState == 4){ // 응답이 모두 완료 되었느냐
					if(request.status == 200){ // 응답 상태가 성공적인 상태이냐 (오류없이 끝냈냐)
						var str = request.responseText;
						document.getElementById("msg").innerHTML = str;
					}
				}
			}
			request.open("get","hello.jsp",true); // 비동기 방식으로 돌림. 비동기 방식으로 할때는 onreadystatechange와 같이 써야함
			request.send();
		}
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<textarea rows="10" cols="20"></textarea>
	<br>
	<button id="btn">ajax 통신</button>
	<h1 id="msg"></h1>
</body>
</html>