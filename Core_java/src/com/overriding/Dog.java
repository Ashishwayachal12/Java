package com.overriding;

public class Dog extends Animal {
	
	@Override
	public void sound() {
		super.sound();
		System.out.println("bow-bow");
	}

}
