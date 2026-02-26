package com.collection;

import java.util.LinkedList;

public class Test_4 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		list.add(104);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
	}

}
