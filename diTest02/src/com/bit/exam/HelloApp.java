package com.bit.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam/beans01.xml"); // 파일을 가져오는거니 구분을 /로 함
		MessageBean mb = (MessageBean)context.getBean("mb");
		mb.sayHello("홍길동");
	}
}