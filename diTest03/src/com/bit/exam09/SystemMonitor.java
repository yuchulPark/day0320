package com.bit.exam09;

public class SystemMonitor {
	private int periodTime;
	private SmsSender sender;
	public void monitor() {
		System.out.println(periodTime + "�� �������� ");
		sender.send();
	}
	public void setPeriodTime(int periodTime) {
		this.periodTime = periodTime;
	}
	public void setSender(SmsSender sender) {
		this.sender = sender;
	}
}
