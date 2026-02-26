package com.collection;

public class Mobile {
	String brand;
	String color;
	double price;

	public Mobile(String brand, String color, double price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return brand + " " + color + " " + price;
	}

}
