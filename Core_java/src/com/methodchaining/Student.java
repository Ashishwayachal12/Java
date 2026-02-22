package com.methodchaining;

public class Student {
	int sId;
	String name;
	int age;
	String gender;
	long mobNo;

	public Student(int sId, String name, int age, String gender, long mobNo) {
		super();
		this.sId = sId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mobNo = mobNo;
	}

	public static Student addStudent(int sId, String name, int age, String gender, long mobNo) {
		Student s = new Student(sId, name, age, gender, mobNo);
		return s;
	}

	public void details() {
		System.out.println("Student id is:" + sId);
		System.out.println("Student name is:" + name);
		System.out.println("Student age is:" + age);
		System.out.println("Student gender is:" + gender);
		System.out.println("Student mobNo is:" + mobNo);
		System.out.println();
	}

}
