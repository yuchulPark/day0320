package com.bit.exam;

public class MessageBeanKo implements MessageBean {
	public MessageBeanKo() {
		System.out.println("생성자 동작함");
	}
	
	@Override
	public void sayHello(String name) {
		System.out.println("안녕하세요. " + name);
		
	}
}
