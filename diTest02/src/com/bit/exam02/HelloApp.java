package com.bit.exam02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam02/beans01.xml"); // ������ �������°Ŵ� ������ /�� ��
		MessageBean mb = (MessageBean)context.getBean("mb");
		mb.sayHello("ȫ�浿");
	}
}