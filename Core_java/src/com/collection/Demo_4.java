package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo_4 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("smith");
		list.add("allen");
		list.add("king");
		list.add("kiran");
		list.add("millan");
		Iterator<String> it = list.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
