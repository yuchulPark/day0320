<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		var arr = [{name:"홍길동",age:20},{name:"이순신",age:40}];
		for(var i in arr){
			for(var j in arr[i]){
				alert(arr[i][j])
			}
		}
	</script>
</body>
</html>