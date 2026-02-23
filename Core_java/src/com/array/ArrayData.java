package com.array;

import java.util.Scanner;

public class ArrayData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int a[] = new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter " + (i + 1) + " element");
			a[i] = sc.nextInt();
		}
		for (int i : a)
			System.out.println(i);
		sc.close();
	}

}
