package com.oops;

public class Bike {
	String brand;
	double price;
	int cc;
	
//        constructor overloading
	public Bike(String brand, double price, int cc) {
		super();
		this.brand = brand;
		this.price = price;
		this.cc = cc;
	}

	public Bike(double price, String brand, int cc) {
		this.brand = brand;
		this.price = price;
		this.cc = cc;
	}

	public Bike(String brand, int cc, double price) {
		this.brand = brand;
		this.price = price;
		this.cc = cc;
	}

	private static void detail(Bike b) {
		System.out.println("My bike brand is:" + b.brand);
		System.out.println("My bike price is:" + b.price);
		System.out.println("My bike cc is:" + b.cc);
		System.out.println("-------------------");

	}

	public static void main(String[] args) {
		Bike b = new Bike("dsfh", 12.0, 44);
		detail(b);
		Bike b1 = new Bike(200, "xyz", 55);
		detail(b1);
		Bike b2 = new Bike("sdgh", 55, 373.3);
		detail(b2);
	}

}
