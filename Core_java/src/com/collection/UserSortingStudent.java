package com.collection;

import java.util.Comparator;

public class UserSortingStudent implements Comparator<Student_1> {

	@Override
	public int compare(Student_1 o1, Student_1 o2) {
		Student_1 s1 = (Student_1) o1, s2 = (Student_1) o2;
		return s1.sID > s2.sID ? 1 : s1.sID < s2.sID ? -1 : 0;

	}

}
