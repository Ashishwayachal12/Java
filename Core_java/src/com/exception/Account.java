package com.exception;

public class Account extends Throwable{
	String AccHolderName;
	double balance;

	public Account(String accHolderName, double balance) {
		super();
		AccHolderName = accHolderName;
		this.balance = balance;
	}

	public void withDrow(double amount) throws InsufficientBalanceException {
		if (amount < balance) {
			System.out.println(amount + " is debited successfully");
		} else {
			throw new InsufficientBalanceException("Insufficient Balance Execption");
		}
	}

	public static void main(String[] args) throws InsufficientBalanceException {
		Account account = new Account("smith", 1000);
		account.withDrow(100);
	}

}
