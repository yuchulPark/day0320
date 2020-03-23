<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			//$.ajax("memberList.jsp", {success:function(data){
			$.ajax("MemberList", {success:function(data){
				var arr = eval("(" + data + ")")
				
				$.each(arr, function(i, member){
					var td1 = $("<td></td>").html(member.name)
					var td2 = $("<td></td>").html(member.age)
					var tr = $("<tr></tr>").append(td1, td2)
					$("#tb").append(tr)
				})
			}})
		})
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table id="tb" border="1" width="80%">
		<tr>
			<td>이름</td>
			<td>나이</td>
		</tr>
	</table>
	<button id="btn">회원정보 읽어오기</button>
</body>
</html>