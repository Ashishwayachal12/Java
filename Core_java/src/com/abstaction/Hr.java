package com.abstaction;

public class Hr extends Employee {
	int noOfEmployeeHired;

	public Hr(double salary, int noOfEmployeeHired) {
		super(salary);
		this.noOfEmployeeHired = noOfEmployeeHired;
	}

	public void calculateSalary() {
		double totalSalary = salary + (noOfEmployeeHired * 1000);
		System.out.println("Employee salary:" + totalSalary);
	}

}
