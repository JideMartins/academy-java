package com.bptn.course._07_OOP.overloading;

public class Pet {
	private String name;
	private String type;

	public Pet(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String speak() {
		return "grrr!";
	}

	public static void main(String[] args) {
		Dog dog = new Dog("Billy");
		System.out.println(dog.getType());
		System.out.println(dog.speak());
		
		System.out.println("================");

		Pet pet = new Pet("Sammy", "Hamster");
		System.out.println(pet.getType());
		System.out.println(pet.speak());

	}

}
