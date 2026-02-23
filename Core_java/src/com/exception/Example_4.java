package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vowel:");
		char ch = sc.next().charAt(0);
		switch (ch) {
		case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
			System.out.println(ch + " is vowel");
			break;
		default:
			throw new InputMismatchException("Given charater is not vowel");
		}
		sc.close();
	}

}
