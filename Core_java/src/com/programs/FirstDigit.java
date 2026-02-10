package com.programs;

import java.util.Scanner;

public class FirstDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();

		while (n > 9) {
			n /= 10;
		}
		System.out.println(n);
		sc.close();

	}

}
