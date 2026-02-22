package com.objectclass;

public class Student {
	int sId;
	String name;

	public Student(int sId, String name) {
		super();
		this.sId = sId;
		this.name = name;
	}

	public String toString() {
		return "name is:" + name + "\n id is:" + sId;
	}

	public static void main(String[] args) {
		Student s1 = new Student(101, "smith");
		System.out.println(s1);
		System.out.println(s1.toString());
		Student s2 = new Student(10, "allen");
		System.out.println(s1.equals(s2));
		Student s3=s2;
		System.out.println(s2.equals(s3));
	}
}
