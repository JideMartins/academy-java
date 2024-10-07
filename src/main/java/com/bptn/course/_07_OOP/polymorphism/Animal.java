package com.bptn.course._07_OOP.polymorphism;

public class Animal {
	public void makeSound() {
		System.out.println("Some animal sound");
	}
}

class Dog extends Animal{
	@Override
	public void makeSound() {
		System.out.println("Woof!");
	}
}

class Cat extends Animal{
	@Override
	public void makeSound() {
		System.out.println("Meow!");
	}
}


