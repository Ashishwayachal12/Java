package com.inheritance;

public class Puma extends Shoes {
	String color;

	public Puma(String brand, double price, String color) {
		super(brand, price);
		this.color = color;
	}

	public void details() {
		System.out.println("Shoes brand is:" + brand);
		System.out.println("shoes price is:" + price);
		System.out.println("shoes color is:" + color);
		System.out.println("---------------------");
	}

}
