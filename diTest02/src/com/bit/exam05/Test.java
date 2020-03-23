package com.bit.exam05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam05/beans.xml");
		Person p = (Person)context.getBean("p");
		p.eat("ġŲ");
	}
}
