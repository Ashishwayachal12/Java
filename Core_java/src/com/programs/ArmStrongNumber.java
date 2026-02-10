package com.programs;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt(), count = 0, sum = 0;
		for (int a = num; a > 0; a /= 10) {
			count++;
		}
		for (int a = num; a > 0; a /= 10) {
			int last = a % 10, pow = 1;
			for (int s = 1; s <= count; s++) {
				pow *= last;
			}
			sum += pow;

		}
		System.out.println(sum == num ? "true" : "false");
		sc.close();

	}

}
