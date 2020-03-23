package com.bit.exam03;

public class MessageBeanKo implements MessageBean {
	private String title;
	private int year;
	
	public MessageBeanKo(String title, int year) {
		super();
		this.title = title;
		this.year = year;
	}

	@Override
	public void sayHello(String name) {
		System.out.println("æ»≥Á«œººø‰. " + name);
		System.out.println(title);
		System.out.println(year);		
	}
}
