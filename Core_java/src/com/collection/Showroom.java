package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Showroom {
	public static void main(String[] args) {
		List<Bike> list = new ArrayList<Bike>();
		list.add(new Bike("Jawa", 200, 120));
		list.add(new Bike("xl", 550, 160));
		list.add(new Bike("yamaha", 580, 110));

		System.out.println("Forward:");
		ListIterator<Bike> li = list.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("\nReverse:");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}
