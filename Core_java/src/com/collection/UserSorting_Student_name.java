package com.collection;

import java.util.Comparator;

public class UserSorting_Student_name implements Comparator<Student_1> {

	@Override
	public int compare(Student_1 o1, Student_1 o2) {
		Student_1 s1 = (Student_1) o1, s2 = (Student_1) o2;
		return s2.sName.compareTo(s1.sName);
	}

}
