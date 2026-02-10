package com.constructor_chaining;

public class Student {
	int sid;
	String name;
	int age;
	String gender;

	public Student(int sid, String name, int age, String gender) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	Student() {
		this(0, "Unkown", 0, "Unkown");
	}

	Student(int sid) {
		this(sid, "Unkown", 0, "unkown");

	}

	Student(int sid, String name) {
		this(sid, name, 0, "Unkown");
	}

	Student(int sid, String name, int age) {
		this(sid, name, age, "Unkown");
	}

	public static void main(String[] args) {
		Student s = new Student(121, "Smith", 30, "male");
		deatils(s);
		Student s2 = new Student(1, "allen", 20, "male");
		deatils(s2);
	}

	private static void deatils(Student s) {
		System.out.println("My student id is:" + s.sid);
		System.out.println("My name is:" + s.name);
		System.out.println("My  age is:" + s.age);
		System.out.println("My gender is:" + s.gender);
		System.out.println("-----------------------");

	}

}
