package com.bptn.course._07_OOP.abstraction;

public abstract class Vehicle {
	private int numberOfWheels;
	private String fuelType;
	
	
	//non-abstract method ---constructor too
	public Vehicle(int numberOfWheels, String fuelType) {
		this.numberOfWheels = numberOfWheels;
		this.fuelType = fuelType;
	}
	
	//abstract methods
	public abstract void move();
	public abstract void stop();
	

}
