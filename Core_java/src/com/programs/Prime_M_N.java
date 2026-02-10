package com.programs;

import java.util.Scanner;

public class Prime_M_N {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter start value:");
		int start = sc.nextInt();

		System.out.println("Enter end value:");
		int end = sc.nextInt();

		for (int num = start; num <= end; num++) {
			if (num < 2) continue;

			int count = 0;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					count++;
					break;
				}
			}

			if (count == 0) {
				System.out.println(num);
			}
		}

		sc.close();
	}
}
