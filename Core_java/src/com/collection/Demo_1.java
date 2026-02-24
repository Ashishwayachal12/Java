package com.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo_1 {
	public static void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add(19);
		arr.add('x');
		arr.add("Smith");
		arr.add(true);
		arr.add(106.3);
		System.out.println(arr);
		Object[] o = arr.toArray();
		 System.out.println(Arrays.toString(o)); 
		
	}

}
