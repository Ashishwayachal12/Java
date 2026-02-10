package com.relationship;

public class Student {
	int sId;
	String sName;
	int age;

	Department department;

	public Student(int sId, String sName, int age, String dName) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.age = age;
		if (dName.equalsIgnoreCase("CSE"))
			department = new Department("CSE", "Smith");
		else if (dName.equalsIgnoreCase("EEE"))
			department = new Department("EEE", "Allen");
		else if (dName.equalsIgnoreCase("ISE"))
			department = new Department("ISE", "martin");
	}
	

}
