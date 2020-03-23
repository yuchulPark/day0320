package com.bit.exam08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam08/beans.xml");
		Person p1 = (Person)context.getBean("person");
		Person p2 = (Person)context.getBean("person");
		if(p1 == p2) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		
		
		
//		System.out.println("1");
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam08/beans.xml");
//		System.out.println("2");
//		Person p = (Person)context.getBean("person");
//		System.out.println("3");
//		p.info();
	}
}
