<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h2>memJoinOk</h2>
	<!-- 닉네임 안정했을때 (밑에는 닉네임 정했을때)
	ID : ${member.memId }<br>
	PW : ${member.memPw }<br>
	Mail : ${member.memMail }<br>
	Phone : ${member.memPhone1 } - ${member.memPhone2 } - ${member.memPhone3 }<br> -->
	
	ID : ${m.id }<br>
	PW : ${m.pw }<br>
	Mail : ${m.mail }<br>
	Phone1 : ${m.phones[0].phone1 } - ${m.phones[0].phone2 } - ${m.phones[0].phone3 } <br />
	Phone2 : ${m.phones[1].phone1 } - ${m.phones[1].phone2 } - ${m.phones[1].phone3 } <br />
	AGE : ${m.age } <br />
	ADULT : ${m.adult } <br />
	GENDER : ${m.gender }<br />
	SPORTS : 
		<c:forEach var="sport" items="${m.sports }">
			${sport },
		</c:forEach> <br />
	<p>The time on the server is ${serverTime }</p>
	<br>
	<a href="/exam0308/resources/html/memJoin.html">Go MemJoin</a>
</body>
</html>