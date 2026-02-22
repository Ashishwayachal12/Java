package com.singletonclass;

public class Student {
	int sId;
	String name;
	int age;
	long mobNo;

	private Student(int sId, String name, int age, long mobNo) {
		super();
		this.sId = sId;
		this.name = name;
		this.age = age;
		this.mobNo = mobNo;
	}

	private static Student s;

	public static Student getInstance(int sId, String name, int age, long mobNo) {
		if (s == null) {
			s = new Student(sId, name, age, mobNo);
		}
		return s;

	}

	public void details() {
		System.out.println("Student id is:" + sId);
		System.out.println("Student name is:" + name);
		System.out.println("Student age is:" + age);
		System.out.println("Student mobNo is:" + mobNo);
		System.out.println();
	}

}
