package com.collection;

public class Student implements Comparable<Object> {
	int sid;
	String Sname;
	int age;

	public Student(int sid, String sname, int age) {
		super();
		this.sid = sid;
		Sname = sname;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
		if (s.age < this.age) {
			return -1;  
		} else if (s.age > this.age) {
			return 1;
		} else {
			return 0;
		}
	}

}
