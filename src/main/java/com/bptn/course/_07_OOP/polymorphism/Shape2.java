package com.bptn.course._07_OOP.polymorphism;

public interface Shape2 {
	public void draw();
}

class Circle2 implements Shape2 {
	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}
}

class Square implements Shape2 {
	@Override
	public void draw() {
		System.out.println("Drawing a square");
	}
}
