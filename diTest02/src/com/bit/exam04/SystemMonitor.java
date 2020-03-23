package com.bit.exam04;

public class SystemMonitor {
	private int periodTime;
	private SmsSender sender;
	public SystemMonitor(int periodTime, SmsSender sender) {
		super();
		this.periodTime = periodTime;
		this.sender = sender;
	}
	public void monitor() {
		System.out.println(periodTime + "�� �������� ");
		sender.send();
	}
}
