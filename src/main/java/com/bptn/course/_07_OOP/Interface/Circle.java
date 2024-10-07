package com.bptn.course._07_OOP.Interface;

public class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		// implementation to draw a circle
		System.out.println("Draw a circle");
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
}
