package com.collection;

import java.util.ArrayList;

public class Demo {
	public static <E> void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(29);
		arr.add(34);
		arr.add(50);
		arr.add(50);
		System.out.println(arr);
		ArrayList<Object> arr2 = new ArrayList<Object>();
		arr2.add('x');
		arr2.add("Smith");
		arr2.add(true);
		arr2.add(106.3);
		arr2.addAll(arr);
		System.out.println(arr2);
		arr2.add(5, "King");
		System.out.println(arr2);
		arr2.addAll(2, arr2);
		System.out.println(arr2);
		

	}

}
