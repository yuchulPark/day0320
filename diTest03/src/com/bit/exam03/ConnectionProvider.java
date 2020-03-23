package com.bit.exam03;

import java.sql.Connection;
import java.sql.DriverManager;

//ConnectionProvider 객체를 생성하는 xml과 실험하는 main메소드 작성
public class ConnectionProvider { 
	private String driver;
	private String url;
	private String user;
	private String pwd;
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("Driver");
			conn = DriverManager.getConnection(url,user,pwd);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
