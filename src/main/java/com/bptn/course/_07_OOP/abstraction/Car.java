package com.bptn.course._07_OOP.abstraction;

class Car extends Vehicle{
	public Car(int numberOfWheels, String fuelType) {
		super(numberOfWheels, fuelType);
	}
	
	@Override
	public void move() {
		System.out.println("the car is moving on the road");
	}
	
	@Override
	public void stop() {
		System.out.println("The car has stopped");
	}
}
