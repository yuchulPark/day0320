<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	var app = navigator.userAgent;
	app = app.toLowerCase();
	if(app.indexOf("mobile") != -1){
		location.href="http://192.168.0.42:8080/mobile/main.jsp";
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="blue">
	테스크탑 서비스입니다.
</body>
</html>