package com.bptn.course._07_OOP.overloading;

public class Greeter {

	public String greet() {
		return "Hi";
	}

	public String greet(String who) {
		return "Hello " + who;
	}

	public static void main(String[] args) {
		Greeter g1 = new Greeter();
		System.out.println(g1.greet("Sam"));
		Greeter g2 = new MeanGreater();
		System.out.println(g2.greet("Nimish"));
	}
}
