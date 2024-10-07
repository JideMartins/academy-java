package com.bptn.course._07_OOP.superKeyword;

public class Hero extends Person {
	String power;

	Hero(String name, int age, String power) {
		super(name, age);
		/*
		 * Once we use the super keyword, we no longer need this this.name = name;
		 * this.age = age;
		 */
		this.power = power;
	}

	public String toString() {
		return super.toString() + this.power;
	}

}
