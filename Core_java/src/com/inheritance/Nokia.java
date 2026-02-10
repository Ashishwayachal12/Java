package com.inheritance;

public class Nokia extends Mobile {
	double price;
	String color;

	public Nokia(String brand, String ram, double price, String color) {
		super(brand, ram);
		this.price = price;
		this.color = color;
	}

	public void details() {
		System.out.println("Mobile brand is:" + brand);
		System.out.println("Mobile ram is:" + ram);
		System.out.println("Mobile price is:" + price);
		System.out.println("Mobile color is:" + color);
		System.out.println("---------------------");

	}

}
