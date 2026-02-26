package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MobileShowroom {
	public static void main(String[] args) {
		List<Mobile> list = new ArrayList<Mobile>();
		list.add(new Mobile("oppo", "red", 200));
		list.add(new Mobile("Apple", "blue", 500));
		list.add(new Mobile("Vivo", "black", 300));
		list.add(new Mobile("iQ", "white", 890));

		System.out.println("farword direction:");
		ListIterator<Mobile> li = list.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("\nBackword direction:");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
