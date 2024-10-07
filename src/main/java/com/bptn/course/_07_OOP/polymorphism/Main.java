package com.bptn.course._07_OOP.polymorphism;

public class Main{
	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.makeSound(); // Woof!
		
		animal = new Cat();
		animal.makeSound(); // Meow!
		
		
	}
}
