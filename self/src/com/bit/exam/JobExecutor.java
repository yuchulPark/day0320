package com.bit.exam;

public class JobExecutor { // 생성자를 중복 정의 (xml에서 기본 자료형의 데이터를 int도 String으로 평가하려는 성질이 있음)
	public JobExecutor(String name, int seconds) {
		System.out.println("생성자 호출1");
	}
	public JobExecutor(String name, long seconds) {
		System.out.println("생성자 호출2");
	}
	public JobExecutor(String name, String seconds) {
		System.out.println("생성자 호출3");
	}
}
