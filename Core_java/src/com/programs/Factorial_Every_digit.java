package com.programs;

import java.util.Scanner;

public class Factorial_Every_digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		while (num > 0) {
			int last = num % 10, fact = 1, temp = last;
			do {
				fact *= last--;
			} while (last > 1);
			System.out.println(temp + " Factorial is:" + fact);
			num /= 10;
		}
		sc.close();
	}

}
