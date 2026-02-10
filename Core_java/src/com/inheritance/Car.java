package com.inheritance;

public class Car extends Vehicle {
	int noOfSeats;

	public Car(String brand, int year, int noOfSeats) {
		super(brand, year);
		this.noOfSeats = noOfSeats;
	}

	public void carDetails() {
		vehicleDetails();
		System.out.println("Number of seats in my car is:" + noOfSeats);

	}

}
