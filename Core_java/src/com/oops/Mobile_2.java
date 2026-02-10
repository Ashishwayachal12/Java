package com.oops;

public class Mobile_2 {
	String brand;
	String color;
	double price;

	public Mobile_2(String brand, String color, double price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public static void main(String[] args) {
		Mobile_2 m1 = new Mobile_2("oppo", "white", 5500);
		details(m1);
		Mobile_2 m2 = new Mobile_2("apple", "red", 500);
		details(m2);

	}

	private static void details(Mobile_2 m) {
		System.out.println("My phone brand is:" + m.brand);
		System.out.println("My phone color is:" + m.color);
		System.out.println("My phone price is:" + m.price);
		System.out.println("-----------------------");
	}

}
