package com.bptn.course._07_OOP.overloading;

public class MeanGreater extends Greeter {
	@Override
	public String greet() {
		return "Go Away";
	}

	
	@Override
	public String greet(String who) {
		return "Go away " + who;
	}
}
