<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	결과 : ${re }
	<br>
	<h2>사원등록</h2>
	<hr>
	<form action="insertEmp.do" method="post">
		사원명 : <input type="text" name="ename"><br>
		직급 : <input type="text" name="job"><br>
		급여 : <input type="number" name="sal"><br>
		수당 : <input type="number" name="comm"><br>
		관리자명 : 
		<select name="mgr">
			<c:forEach var="m" items="${mList }">
				<option value="${m.eno }">${m.ename }(${m.job}, ${m.deno })</option>
			</c:forEach>
		</select><br>
		소속부서 : 
		<select name="deno">
			<c:forEach var="d" items="${dList }">
				<option value="${d.deno }">${d.dename }(${d.dloc })</option>
			</c:forEach>
		</select><br>
		이메일 : <input type="email" name="email"><br>
		주민번호 : <input type="text" name="jumin"><br>
		<input type="submit" value="등록">
		<input type="reset" value="취소">
	</form>
</body>
</html>