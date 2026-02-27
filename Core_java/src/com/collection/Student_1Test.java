package com.collection;

import java.util.TreeSet;

public class Student_1Test {
	public static void main(String[] args) {
		TreeSet<Student_1> set = new TreeSet<Student_1>(new UserSortingStudent());
		set.add(new Student_1(12, "smith", 25));
		set.add(new Student_1(01, "allen", 35));
		set.add(new Student_1(101, "king", 20));
		set.add(new Student_1(34, "martin", 15));
		System.out.println("Sorted by ID:");
		printSet(set);

		TreeSet<Student_1> setByAge = new TreeSet<>(new UserSorting_age());
		setByAge.addAll(set);
		System.out.println("\nSorted by Age (Descending):");
		printSet(setByAge);

		TreeSet<Student_1> setByname = new TreeSet<>(new UserSorting_Student_name());
		setByname.addAll(set);
		System.out.println("\nSorted by name :");
		printSet(setByname);

	}

	public static void printSet(TreeSet<Student_1> set) {
		for (Student_1 s : set) {
			System.out.println(s.sID + " " + s.sName + " " + s.age);
		}
	}

}
