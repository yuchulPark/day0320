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
		System.out.println(age + "�� " + name + "��(��) " + food + "�� �Ծ��.");
	}
}
