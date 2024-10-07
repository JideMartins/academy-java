package com.bptn.course._07_OOP.polymorphism;

public class ShapeMain {
	public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();
        
        s1.draw();
        s2.draw();
        s3.draw();
    }

}
