package com.bit.exam;

public class Executor {
	private Worker worker;
	public Executor(Worker worker) {
		super();
		this.worker = worker;
		this.worker.pro(); // �����ÿ� �޼ҵ� ȣ��
		System.out.println("������1");
	}
	public Executor(String run) {
		System.out.println("������2");
		System.out.println(run);
	}
}
