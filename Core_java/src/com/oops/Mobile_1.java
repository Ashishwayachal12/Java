package com.oops;

public class Mobile_1 {

	String brand;
	double price;
	String color;

	public static void details(Mobile m) {
		System.out.println(m.brand);
		System.out.println(m.color);
		System.out.println(m.price);
		System.out.println("-------------");
	}

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.brand = "oppo";
		m1.color = "white";
		m1.price = 55000.00;
		details(m1);

		Mobile m2 = new Mobile();
		m2.brand = "Apple";
		m2.color = "red";
		m2.price = 5000.00;
		details(m2);
	}

}
