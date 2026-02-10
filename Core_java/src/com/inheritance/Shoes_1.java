package com.inheritance;

public class Shoes_1 extends Product {
	String brand;
	double price;

	public Shoes_1(int pId, String brand, double price) {
		super(pId);
		this.brand = brand;
		this.price = price;
	}

	public void shoesDetails() {
		productDetails();
		System.out.println("Shoes brand is:" + brand);
		System.out.println("Shoes price is:" + price);
	}

}
