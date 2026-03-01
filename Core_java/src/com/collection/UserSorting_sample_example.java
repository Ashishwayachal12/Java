package com.collection;

import java.util.Comparator;

public class UserSorting_sample_example implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}

}
