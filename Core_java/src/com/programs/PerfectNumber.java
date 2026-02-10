package com.programs;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt(), sum = 1;
		for (int s = 2; s <= num / 2; s++) {
			if (num % s == 0) {
				sum += s;
			}
		}
		System.out.println(num == sum ? num + " is perfect number." : num + " is not a perfect number.");
		sc.close();
	}

}
