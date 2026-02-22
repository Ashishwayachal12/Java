package com.overriding;

public class DogTest {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.sound();
		Dog d = new Dog();
		d.sound();
		Dog d1 = (Dog) a;
		d1.sound();
	}

}
