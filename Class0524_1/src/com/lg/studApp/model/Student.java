package com.lg.studApp.model;

public class Student {
	private String name /*= {"ȫ�浿", "��浿", "�ڱ浿", "�̱浿", "�ֱ浿"}*/;
	private int age /*= {20,25,30,35,40}*/;
	private char gender;
	private String address;
	
	public Student(String name, int age, char gender, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	
	@Override
	public String toString() {
		String str = "�̸� : " + name + "\n";
		str += "���� : " + gender + "\n";
		str += "���� : " + age + "\n";
		str += "�ּ� : " + address + "\n";
		
		return str;
	}
	
	
	public void showStInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + gender);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
	}
}