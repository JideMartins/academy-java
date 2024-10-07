package com.bptn.course._07_OOP.abstraction;

public class Bicycle extends Vehicle {
	public Bicycle(int numberOfWheels, String fuelType) {
		super(numberOfWheels, fuelType);
	}
	
	@Override
	public void move() {
		System.out.println("The bicycle has moved left and now heading North");
	}
	
	@Override
	public void stop() {
		System.out.println("It stopped close to the hill");
	}

}
