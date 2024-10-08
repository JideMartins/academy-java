package com.bptn.course._10_collections.students;

public class Student {
	private String name, email;
	private int id;
	
	public Student(String name, String email, int id) {
		this.name = name;
		this.email = email;
		this.id = id;
	}
	
	public String toString() {
		return id + " " + name + " " + email;
	}
	
}
