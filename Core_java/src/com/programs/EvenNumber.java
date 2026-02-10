package com.programs;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stating:");
		int str = sc.nextInt();
		System.out.println("Enter ending:");
		int end = sc.nextInt();
		int count = 0;
		for (int i = str; i <= end; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
