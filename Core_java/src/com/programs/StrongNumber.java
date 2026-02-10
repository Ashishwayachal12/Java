package com.programs;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt(), sum = 0, temp = num;
		while (num > 0) {
			int last = num % 10, fact = 1;
			while (last > 1) {
				fact *= last--;
			}
			sum += fact;
			num /= 10;
		}
		if (temp == sum) {
			System.out.println(temp + " is a strong number.");
		} else {
			System.out.println(temp + " is not a strong number.");

		}
		sc.close();
	}

}
