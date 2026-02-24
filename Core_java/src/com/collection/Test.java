package com.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		ArrayList<Object> aL = new ArrayList<Object>(a);
		aL.add(a);
		aL.add(10);
		aL.add("ashish");
		aL.add(true);
		aL.add(10.56);
		aL.add(10 / 2);
		System.out.println(aL);
		System.out.println(((Object) aL).getClass().getName());
		sc.close();

	}

}
