package com.collection;

import java.util.TreeSet;

public class StudentTest {
	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<>();
		set.add(new Student(12, "smith", 25));
		set.add(new Student(01, "allen", 35));
		set.add(new Student(101, "king", 20));
		set.add(new Student(34, "martin", 15));
		for (Student s : set) {
			System.out.println(s.sid + " " + s.Sname + " " + s.age);
		}
	}

}
