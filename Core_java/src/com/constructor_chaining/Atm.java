package com.constructor_chaining;

public class Atm {
	int pin;
	double balance;

	public Atm(int pin, double balance) {
		super();
		this.pin = pin;
		this.balance = balance;
	}

	public void deposite(double amount) {
		balance += amount;
		System.out.println("Amount is credited successfully.");
	}

	public void withdrow(double amount) {
		if (amount < balance) {
			balance -= amount;
			System.out.println("Amount is withdrowed successfully.");
		} else {
			System.out.println("insufficient balance.");
		}
	}

	public void checkBalance() {
		System.out.println("balance is:" + balance);
	}

}
