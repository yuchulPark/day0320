package com.bit.exam05;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void eat(String food) {
		System.out.println(age + "살 " + name + "이(가) " + food + "를 먹어요.");
	}
}
