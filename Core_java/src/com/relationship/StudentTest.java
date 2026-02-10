package com.relationship;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student(1, "king", 30, "CSE");
		System.out.println(s.sId);
		System.out.println(s.sName);
		System.out.println(s.age);
		System.out.println(s.department.dName);
		System.out.println(s.department.hodName);
	}

}
