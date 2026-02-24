package com.collection;

import java.util.ArrayList;

public class Example_1 {
	public static <E> void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add(19);
		arr.add('x');
		arr.add("Smith");
		arr.add(true);
		arr.add(106.3);
		arr.add('x');
		arr.add(106.3);
		arr.retainAll(arr);
		System.out.println(arr);
		ArrayList<Object> arr1 = new ArrayList<Object>();
		arr1.add(50);
		arr1.add(29);
		arr1.add(34);
		arr1.add(29);
		arr1.add(50);
		arr1.retainAll(arr);
		System.out.println(arr1);
		arr1.addAll(arr);
		System.out.println(arr1);
		System.out.println(arr);
		arr.clear();
		System.out.println(arr);
		

	}

}
