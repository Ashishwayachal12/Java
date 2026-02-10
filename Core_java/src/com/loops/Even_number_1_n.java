package com.loops;

import java.util.Scanner;

public class Even_number_1_n {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int start = 1, end = sc.nextInt(), count = 0;
		do {
			if (start % 2 == 0) {
				System.out.println(start);
				count++;
			}
			start++;
		} while (start <= end);
		System.out.println("count of even number are: " + count);
		sc.close();
	}

}
