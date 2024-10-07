package com.bptn.course._07_OOP;

public class ThisCar {
	private String color, brand;
	private int price;

	public ThisCar(String color, String brand, int price) {
		this.color = color;
		this.brand = brand;
		this.price = price;
	}
	
	public ThisCar() {
		this("White", "BMW", 50000); //default constructor
		
	}
	
	
	public void print() {
		System.out.println(color + " " + brand + " " + price);
	}

	public void printDetails() {
		System.out.println("Car details are:\n" + "Color: " + color + "\nBrand: " + brand + "\nPrice: " + price);
		this.print();
	}


	public static void main(String[] args) {
		ThisCar car1 = new ThisCar("Space black", "Mercedes", 40000);
		ThisCar car2 = new ThisCar("Black", "Hyndai", 23000);
		car1.printDetails();
		System.out.println("=================");
		car2.printDetails();
		
	}

}
