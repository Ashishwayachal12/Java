package com.programs;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		for (int s = 1, num = sc.nextInt(); s <= num; s++) {
			if (num % s == 0) {
				System.out.println(s);
			}
		}
		sc.close();
	}
}
