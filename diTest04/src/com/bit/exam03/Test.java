package com.bit.exam03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Person p1 = (Person)context.getBean("p");
		Person p2 = (Person)context.getBean("p");
		if(p1==p2) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
	}
}
