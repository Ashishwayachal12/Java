package com.collection;

import java.util.ArrayList;

public class Example_3 {
	public static void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add(19);
		arr.add('x');
		arr.add("Smith");
		arr.add(true);
		arr.add(106.3);
		arr.add('x');
		arr.add(106.3);
		System.out.println(arr);
		System.out.println(arr.contains(19));
		System.out.println(arr.indexOf("Smith"));
		ArrayList<Object> arr1 = new ArrayList<Object>();
		arr1.add(50);
		arr1.add(29);
		arr1.add(34);
		arr1.add(29);
		arr1.add(50);
		System.out.println(arr1);
		System.out.println(arr1.indexOf(50));
		System.out.println(arr1.containsAll(arr));
		arr1.addAll(arr);
		System.out.println(arr1.containsAll(arr));

	}

}
