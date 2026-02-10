package com.constructor_chaining;

import java.util.Scanner;

public class AtmTest {
	{
		System.out.println("----------welcome to free atm----------");
	}

	public static void main(String[] args) {
		Atm atm = new Atm(123, 2000);
		new AtmTest();

		Scanner sc = new Scanner(System.in);
		boolean execution = true; // execution

		do {
			System.out.println("Press 1 for checkbalance");
			System.out.println("Press 2 for deposite");
			System.out.println("Press 3 for withdrow");
			System.out.println("press 0 for exit");

			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch (choice) {

				case 1:
					atm.checkBalance();
					break;
				case 2:
					System.out.println("Enter amount:");
					double amount = sc.nextDouble(); // amount
					if (amount % 100 == 0) {
						atm.deposite(amount);
					} else {
						System.out.println("Invalid amount");
					}
					break;
				case 3:
					System.out.println("Enter amount:");
					double amount1 = sc.nextDouble(); // amount1
					atm.withdrow(amount1);
					break;

				case 0:
					execution = false;
					System.out.println("Thank you for using application.");
					if (execution == false) {
						System.exit(0);
					}
					break;
				default:
					System.out.println("invalid input.");
			}

		} while (execution);
		sc.close();
	}

}
