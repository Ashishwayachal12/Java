package com.relationship;

public class BikeTest {
	public static void main(String[] args) {
		Bike b = new Bike("XL", 200);
		System.out.println(b.brand);
		System.out.println(b.price);
		System.out.println(b.e.cc);
		System.out.println(b.e.stocktype);
	}

}
