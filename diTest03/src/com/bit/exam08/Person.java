package com.bit.exam08;

public class Person { // 셋터에 의해서 초기화해준다는 뜻
	private String name;
	private int age;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void info() {
		System.out.println(name + ", " + age);
	}
	public Person() {
		System.out.println("생성자 동작함");
	}
}
