package com.encpsulation;

public class Atm {
	int pin;
	int balance;

	public Atm(int pin, int balance) {
		super();
		this.pin = pin;
		this.balance = balance;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
