package com.inheritance;

public class VehicleTest {
	public static void main(String[] args) {
		Bike b = new Bike("XL", 2013, 120);
		b.bikeDetails();
		Car c = new Car("BMW", 2023, 4);
		c.carDetails();
	}

}
