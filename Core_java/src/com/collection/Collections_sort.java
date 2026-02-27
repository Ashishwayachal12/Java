package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_sort {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(34);
		list.add(12);
		list.add(89);
		list.add(01);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		Collections.sort(list, new UserSorting_int());
		System.out.println(list);
	}

}
