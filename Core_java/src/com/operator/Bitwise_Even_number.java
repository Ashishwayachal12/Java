package com.operator;

import java.util.Scanner;

public class Bitwise_Even_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		String res = (num & 1) == 0 ? "Even" : "odd";
		System.out.println(res);
		System.out.println(~45>>1);
		sc.close();
	}

}
