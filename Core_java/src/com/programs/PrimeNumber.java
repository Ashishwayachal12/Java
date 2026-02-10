package com.programs;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt(), count = 2;
		for (int s = 2; s <= num / 2; s++) {
			if (num % s == 0) {
				count++;
				break;
			}
		}
		if (count == 2) {
			System.out.println(num + " is a primeNumber.");
		} else {
			System.out.println(num + " is not a primeNUmber.");
		}
		sc.close();

	}

}
