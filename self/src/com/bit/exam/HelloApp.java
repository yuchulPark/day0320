package com.bit.exam;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class HelloApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam/beans.xml"); // 파일을 가져오는거니 구분을 /로 함
		MessageBean mb = (MessageBean)context.getBean("mb");
		mb.sayHello("유철");
		
		
	}
}
