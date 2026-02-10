package com.oops;

public class Car {
	String brand;
	double price;
	String color;
	
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.brand);
		System.out.println(c.price);
		System.out.println(c.color);
		
		c.brand="BMW";
		c.price=100;
		c.color="black";
		System.out.println(c.brand);
		System.out.println(c.price);
		System.out.println(c.color);
		
		
	}

}
