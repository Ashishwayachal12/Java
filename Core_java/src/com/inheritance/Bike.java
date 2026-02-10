package com.inheritance;

public class Bike extends Vehicle {
	int cc;

	public Bike(String brand, int year, int cc) {
		super(brand, year);
		this.cc = cc;
	}

	public void bikeDetails() {
		vehicleDetails();
		System.out.println("cc is:" + cc);
	}

}
