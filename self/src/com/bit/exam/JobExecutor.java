package com.bit.exam;

public class JobExecutor { // �����ڸ� �ߺ� ���� (xml���� �⺻ �ڷ����� �����͸� int�� String���� ���Ϸ��� ������ ����)
	public JobExecutor(String name, int seconds) {
		System.out.println("������ ȣ��1");
	}
	public JobExecutor(String name, long seconds) {
		System.out.println("������ ȣ��2");
	}
	public JobExecutor(String name, String seconds) {
		System.out.println("������ ȣ��3");
	}
}
