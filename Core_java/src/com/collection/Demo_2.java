package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo_2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("smith");
		list.add("allen");
		list.add("king");
		list.add("kiran");
		list.add("millan");
		Iterator<String> it = list.iterator();

		if (list.contains("Smith")) {   
		    while (it.hasNext()) {
		        System.out.println(it.next());
		    }
		} else {
		    ArrayList<String> list2 = new ArrayList<String>();
		    System.out.println(list2);
		}

	}

}
