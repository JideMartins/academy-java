package com.bptn.course._07_OOP.polymorphism;

public class Shape {
	void draw() {
        System.out.println("Drawing a shape");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}
