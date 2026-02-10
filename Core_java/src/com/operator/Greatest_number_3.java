package com.operator;

import java.util.Scanner;

public class Greatest_number_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int res = a > b ? a : b;
		int res1 = res > c ? res : c;
		System.out.println(res1);
		sc.close();
	}

}
