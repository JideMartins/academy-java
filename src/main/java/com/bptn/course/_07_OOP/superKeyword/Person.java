package com.bptn.course._07_OOP.superKeyword;

public class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public String toString() {
		return this.name + "\n" + this.age + "\n";
	}

}
