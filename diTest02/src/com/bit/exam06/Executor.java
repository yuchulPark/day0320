package com.bit.exam06;

public class Executor {
	private Worker worker;
	public Executor(Worker worker) {
		super();
		this.worker = worker;
		this.worker.pro(); // 생성시에 메소드 호출
		System.out.println("생성자1 동작함");
	}
	public Executor(String run) {
		System.out.println("생성자2 동작함");
		System.out.println(run);
	}
}
