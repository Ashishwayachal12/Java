package com.relationship;

public class Person {
	int id;
	String name;
	int age;
	long mobNo;

	public Person(int id, String name, int age, long mobNo) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mobNo = mobNo;
	}

	Pancard pancard;

	public void addPan(String panNo) {
		if (age >= 18)
			pancard = new Pancard(panNo, id);
		else
			System.out.println("age is invalid.");
	}
	

}
