package com.abstaction;

public abstract class Employee {
	double salary;

	public Employee(double salary) {
		super();
		this.salary = salary;
	}

	abstract void calculateSalary();

	static void test() {
		System.out.println("a");
	}

}
