package com.bit.exam03;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam03/beans.xml");
		ConnectionProvider conn = (ConnectionProvider)context.getBean("conn");
		Connection connection = conn.getConnection();
		System.out.println(conn);
		System.out.println(connection);
	}
}
