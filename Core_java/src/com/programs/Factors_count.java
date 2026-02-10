package com.programs;

import java.util.Scanner;

public class Factors_count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt(), count = 0, s = 1;
		do {
			if (n % s == 0) {
				count++;
				System.out.println(s);
			}
			s++;
		} while (s <= n);
		System.out.println("count of Factors is: " + count);
		sc.close();
	}

}
