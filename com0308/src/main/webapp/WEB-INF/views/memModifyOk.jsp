<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>memModifyOk</h2>
	<br>
	<h3>memBefore</h3>
	ID : ${memBefore.id }<br>
	PW : ${memBefore.pw }<br>
	Mail : ${memBefore.mail }<br>
	Phone1 : ${memBefore.phones[0].phone1 } - ${memBefore.phones[0].phone2 } - ${memBefore.phones[0].phone3 } <br />
	Phone2 : ${memBefore.phones[1].phone1 } - ${memBefore.phones[1].phone2 } - ${memBefore.phones[1].phone3 } <br />
	AGE : ${memBefore.age } <br />
	ADULT : ${memBefore.adult } <br />
	GENDER : ${memBefore.gender }<br />
	SPORTS : 
		<c:forEach var="sport" items="${memBefore.sports }">
			${sport },
		</c:forEach> 
	<br>
	<h3>memAfter</h3>
	ID : ${memAfter.id }<br>
	PW : ${memAfter.pw }<br>
	Mail : ${memAfter.mail }<br>
	Phone1 : ${memAfter.phones[0].phone1 } - ${memAfter.phones[0].phone2 } - ${memAfter.phones[0].phone3 } <br />
	Phone2 : ${memAfter.phones[1].phone1 } - ${memAfter.phones[1].phone2 } - ${memAfter.phones[1].phone3 } <br />
	AGE : ${memAfter.age } <br />
	ADULT : ${memAfter.adult } <br />
	GENDER : ${memAfter.gender }<br />
	SPORTS : 
		<c:forEach var="sport" items="${memAfter.sports }">
			${sport },
		</c:forEach> <br />
	<p>the time on the server is ${serverTime }</p>
	<br>
	<a href="/exam0308/resources/html/index.html">Go Main</a>	
</body>
</html>