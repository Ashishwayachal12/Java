package com.inheritance;

public class Vehicle {
	String brand;
	int year;

	public Vehicle(String brand, int year) {
		super();
		this.brand = brand;
		this.year = year;
	}

	public void vehicleDetails() {
		System.out.println("Brand is:" + brand);
		System.out.println("year is:" + year);
	}

}
