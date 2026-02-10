package com.constructor_chaining;

public class Bike {
	String brand;
	int cc;
	double miles;

	Bike(String brand) {
		this.brand = brand;
	}

	Bike(String brand, int cc) {
		this(brand);
		this.cc = cc;
	}

	Bike(String brand, int cc, double miles) {
		this(brand, cc);
		this.miles = miles;
	}

	public static void main(String[] args) {
		Bike b1 = new Bike("paluser", 120, 60);
		details(b1);
		Bike b2 = new Bike("XL");
		details(b2);

	}

	private static void details(Bike b) {
		System.out.println("My bike brand is:" + b.brand);
		System.out.println("My bike cc is:" + b.cc);
		System.out.println("My bike miles is:" + b.miles);
		System.out.println("----------------------");

	}

}
