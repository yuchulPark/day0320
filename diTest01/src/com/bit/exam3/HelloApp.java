package com.bit.exam3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class HelloApp {
	public static void main(String[] args) {
		Resource resource = new FileSystemResource("beans.xml"); // ������ �о���� (���ҽ� ����) 
		BeanFactory factory = new XmlBeanFactory(resource); // ��ü �����ڷμ� ������ �ϴ� Ŭ���� : BeanFactory
		MessageBean mb = (MessageBean)factory.getBean("mb"); // ��ü�� ����
		mb.sayHello("ȫ�浿");
	
	}
}
