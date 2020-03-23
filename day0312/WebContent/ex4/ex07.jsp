<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		var arr = [{title:"네이버", url:"http://www.naver.com"},
			{title:"구글", url:"http://google.co.kr"},
			{title:"다음", url:"http://daum.net"}];	
		$.each(arr, function(idx, item){
			var a = $("<a></a>").html(item.title).attr("href",item.url);
			$("body").append(a);
		});
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>