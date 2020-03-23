package com.bit.vo;

public class MemberVO {
	private String id;
	private String name;
	private int tel;
	private int age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public MemberVO(String id, String name, int tel, int age) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.age = age;
	}
	public MemberVO() {
		super();
	}
}
