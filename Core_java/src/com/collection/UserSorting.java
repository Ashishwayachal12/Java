package com.collection;

import java.util.Comparator;

public class UserSorting implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1, i2 = (Integer) o2;
		if (i1 < i2) {
			return 1;
		} else if (i1 > i2) {
			return -2;
		} else {
			return 0;
		}

	}

}
