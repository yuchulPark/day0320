
<%@page import="org.springframework.web.servlet.DispatcherServlet"%>
<%@page import="org.springframework.web.filter.CharacterEncodingFilter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// DispatcherServlet
		// CharacterEncodingFilter
		// response.sendRedirect("listCustomer.do");
		// response.sendRedirect("listBook.do");
		response.sendRedirect("insertOrders.do");
		
	%>
</body>
</html>