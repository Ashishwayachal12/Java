package com.operator;

import java.util.Scanner;

public class SmallestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int num = sc.nextInt(), num2 = sc.nextInt();
		int res = num < num2 ? num : num2;
		System.out.println(res);
		sc.close();
	}

}
