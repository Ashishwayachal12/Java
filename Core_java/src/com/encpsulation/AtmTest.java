package com.encpsulation;

public class AtmTest {
	public static void main(String[] args) {
		Atm a = new Atm(123, 2000);
		System.out.println(a.getPin());
		System.out.println(a.getBalance());
		a.setPin(321);
		a.setBalance(30000);
		System.out.println(a.getPin());
		System.out.println(a.getBalance());
		
	}

}
