package com.bit.exam04;

import java.sql.DriverManager;

public class Test {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","c##bit1234","bit1234");
			System.out.println("��������");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
