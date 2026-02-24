package com.collection;

import java.util.ArrayList;

public class Example {
	public static <E> void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add(19);
		arr.add('x');
		arr.add("Smith");
		arr.add(true);
		arr.add(106.3);
		System.out.println(arr);
		arr.remove(0);
		System.out.println(arr);
		Object o = 'x';
		arr.remove(o);
		System.out.println(arr);
		arr.removeAll(arr);
		System.out.println(arr);

	}

}
