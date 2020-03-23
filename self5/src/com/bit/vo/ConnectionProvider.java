package com.bit.vo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionProvider {
	public static Connection getConnection(String user, String pwd) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void close(ResultSet rs, Statement st, Connection conn) {
		try {
			if(rs != null) {
				rs.close();
			}
			if(st != null) {
				st.close();
			}
			if(conn != null) {
				conn.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 MVC 패턴 - MODEL (일처리를 위한 자바 클래스들) VIEW (사용자 화면에 보여주기를 담당하는 JSP) Controller 사용자의 요청을 받아들이고 요청을 파악하는 서블릿
	 FrontController - 사용자의 모든 요청을 받아들여 처리하는 Controller (Servlet)
	  - 사용자의 요청별로 Controller를 따로 만들지 않고, 하나로 만들어 웹 어플리케이션의 정문 앞에 세워두고, 사용자의 모든 요청을 파악하여 해당 일처리를 위한 담당자(Action)에게 일을 맡기고, 일처리 결과에 따라 view를 결정해주는 역할을 함 (어디로 가야할지)
	  
	 	 */ 
	 
}
