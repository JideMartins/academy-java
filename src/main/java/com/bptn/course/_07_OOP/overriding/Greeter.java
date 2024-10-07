package com.bptn.course._07_OOP.overriding;

public class Greeter {
	public String greet() {
		return "hi";
	}

	public static void main(String[] args) {
		Greeter g1 = new Greeter();
		System.out.println(g1.greet());
		
		Greeter g2 = new MeanGreeter();
		System.out.println(g2.greet());
		
		Greeter g3 = new SpanishGreeter();
		System.out.println(g3.greet());

	}

}
