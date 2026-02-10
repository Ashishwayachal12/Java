package com.oops;

public class Mobile {
	String brand;
	double price;
	String color;

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		System.out.println(m1.brand);
		System.out.println(m1.color);
		System.out.println(m1.price);

		m1.brand = "apple";
		m1.price = 55000.0;
		m1.color = "red";
		System.out.println(m1.brand);
		System.out.println(m1.color);
		System.out.println(m1.price);

	}

}
