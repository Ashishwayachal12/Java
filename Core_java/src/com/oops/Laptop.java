package com.oops;

public class Laptop {

	String brand;
	String ram;
	String rom;
	double price;

	private static void details(Laptop l) {
		System.out.println("My laptop brand is:" + l.brand);
		System.out.println("My laptop ram is:" + l.ram);
		System.out.println("My laptop rom is:" + l.rom);
		System.out.println("My laptop price is:" + l.price);
		System.out.println("---------------------------");

	}

	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.brand = "HP";
		l1.ram = "8GB";
		l1.rom = "1TB";
		l1.price = 55000.0;
		details(l1);

		Laptop l2 = new Laptop();
		l2.brand = "Dell";
		l2.ram = "4GB";
		l2.rom = "500GB";
		l2.price = 60000.0;
		details(l2);
	}

}
