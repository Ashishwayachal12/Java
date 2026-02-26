package com.collection;


public class Bike {
	String brand;
	double price;
	int cc;

	public Bike(String brand, double price, int cc) {
		super();
		this.brand = brand;
		this.price = price;
		this.cc = cc;
	}

	@Override
	public String toString() {
		return brand + " " + price + " " + cc;
	}
}
