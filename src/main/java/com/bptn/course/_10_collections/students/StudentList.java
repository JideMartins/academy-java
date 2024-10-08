package com.bptn.course._10_collections.students;

import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {
		ArrayList<Student> roster = new ArrayList<Student>();
		roster.add(new Student("Jide", "ji@de.com", 141569));
		roster.add(new Student("Bolzee", "bolzee@ji.com", 141570));
		roster.add(new Student("Dara", "dara@ji.com", 141571));
		
		System.out.println(roster);

	}

}
