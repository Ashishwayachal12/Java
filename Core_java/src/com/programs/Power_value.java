package com.programs;

import java.util.Scanner;

public class Power_value {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a base and exponent value:");
		int base = sc.nextInt(), exp = sc.nextInt(), pow = 1;
		for (int s = 1; s <= exp; s++) {
			pow *= base;
		}
		System.out.println(base + "^" + exp + "=" + pow);
		sc.close();

	}

}
