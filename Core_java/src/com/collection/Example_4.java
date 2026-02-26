package com.collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Example_4 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("BMW");
		v.add("Umani");
		v.add("TATA");
		v.add("Benz");
//		for (String s : v) {
//			System.out.println(s);
//		}
//		System.out.println("--------------");
		Iterator<String> it = v.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------------");
		ListIterator<String> li = v.listIterator();
		while (li.hasNext()) {
			li.next();
		}
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
		System.out.println("---------------");
		for (int index = 0; index < v.size(); index++) {
			System.out.println(v.get(index));
		}

	}

}
