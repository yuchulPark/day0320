package com.bit.vo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionProvider {
	public static Connection getConnection(String user, String pwd) { // 객체없이 생성하고 싶어서 static
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:XE", user, pwd);
		}catch(Exception e) {
		}
		return conn;
	}public static void close(ResultSet rs, Statement st, Connection conn) { // 닫는 메소드 만들기
		try {
			if(rs != null) {
				rs.close();
			}if(st != null) {
				st.close();
			}if(conn != null) {
				conn.close();
			}
		}catch(Exception e) {
		} } } 
