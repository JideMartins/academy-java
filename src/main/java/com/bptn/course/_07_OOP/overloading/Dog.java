package com.bptn.course._07_OOP.overloading;

public class Dog extends Pet {
	public Dog(String name) {
		super(name, "dog");
	}
	
	@Override
	public String speak() {
		return "Woof!";
	}

}
