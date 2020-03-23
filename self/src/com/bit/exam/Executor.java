package com.bit.exam;

public class Executor {
	private Worker worker;
	public Executor(Worker worker) {
		super();
		this.worker = worker;
		this.worker.pro(); // 생성시에 메소드 호출
		System.out.println("생성자1");
	}
	public Executor(String run) {
		System.out.println("생성자2");
		System.out.println(run);
	}
}
