package com.bit.exam3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class HelloApp {
	public static void main(String[] args) {
		Resource resource = new FileSystemResource("beans.xml"); // 파일을 읽어들임 (리소스 생성) 
		BeanFactory factory = new XmlBeanFactory(resource); // 객체 제공자로서 역할을 하는 클래스 : BeanFactory
		MessageBean mb = (MessageBean)factory.getBean("mb"); // 객체를 얻어옴
		mb.sayHello("홍길동");
	
	}
}
