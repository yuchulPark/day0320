package com.bit.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam01/beans.xml");
		Person p = (Person)context.getBean("person");
		p.info();
	}
}
