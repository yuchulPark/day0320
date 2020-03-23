package com.bit.exam05;

public class SmsSender {
	private String from;
	private String to;
	public void send() {
		System.out.println(from + "이 " + to + "에게 메시지를 전송함");
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public void setTo(String to) {
		this.to = to;
	}
}
