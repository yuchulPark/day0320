package com.bit.exam;

public class MessageBeanKo implements MessageBean {
	public MessageBeanKo() {
		System.out.println("������ ������");
	}
	
	@Override
	public void sayHello(String name) {
		System.out.println("�ȳ��ϼ���. " + name);
		
	}
}
