package com.bit.exam04;

public class SmsSender {
	private String from;
	private String to;
	
	public void send() {
		System.out.println(from + "�� " + to + "���� �޽����� ������");
	}
	public SmsSender(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}
}
