package com.bit.exam0308.member;

import java.util.List;

public class Member {
	private String id;
	private String pw;
	private String mail;
	private List<MemPhone> phones;
	private int age;
	private boolean adult;
	private String gender;
	private String[] sports;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public List<MemPhone> getPhones() {
		return phones;
	}
	public void setPhones(List<MemPhone> phones) {
		this.phones = phones;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isAdult() {
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getSports() {
		return sports;
	}
	public void setSports(String[] sports) {
		this.sports = sports;
	}
	
}
