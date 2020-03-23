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
	 MVC ���� - MODEL (��ó���� ���� �ڹ� Ŭ������) VIEW (����� ȭ�鿡 �����ֱ⸦ ����ϴ� JSP) Controller ������� ��û�� �޾Ƶ��̰� ��û�� �ľ��ϴ� ����
	 FrontController - ������� ��� ��û�� �޾Ƶ鿩 ó���ϴ� Controller (Servlet)
	  - ������� ��û���� Controller�� ���� ������ �ʰ�, �ϳ��� ����� �� ���ø����̼��� ���� �տ� �����ΰ�, ������� ��� ��û�� �ľ��Ͽ� �ش� ��ó���� ���� �����(Action)���� ���� �ñ��, ��ó�� ����� ���� view�� �������ִ� ������ �� (���� ��������)
	  
	 	 */ 
	 
}
