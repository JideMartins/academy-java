package com.bptn.course._10_collections.student01;

public class Student {
	private String name;
	private int classGrade;
	public Student(String name, int classGrade) {
		this.name = name;
		this.classGrade = classGrade;
	}
	public String getName() {
		return this.name;
	}
	public int getClassGrade() {
		return this.classGrade;
	}
	
	//override the default object toString method
	public String toString() {
		return "Student name is: " + name + " and student's class grade is: Grade " + classGrade;
	}

	
	
}
