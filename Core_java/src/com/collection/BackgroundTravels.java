package com.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class BackgroundTravels {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("smith");
		list.add("allen");
		list.add("king");
		list.add("kiran");
		list.add("millan");
		ListIterator<Object> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
			System.out.println("---------------");
		}
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}

}
