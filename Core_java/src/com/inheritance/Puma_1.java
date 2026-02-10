package com.inheritance;

public class Puma_1 extends Shoes_1 {
	int size;

	public Puma_1(int pId, String brand, double price, int size) {
		super(pId, brand, price);
		this.size = size;
	}

	public void pumaDetails() {
		shoesDetails();
		System.out.println("shoes size is:" + size);
	}

}
