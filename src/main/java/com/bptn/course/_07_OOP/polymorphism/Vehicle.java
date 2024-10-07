package com.bptn.course._07_OOP.polymorphism;

public abstract class Vehicle {
	abstract void start();

	void stop() {
		System.out.println("Stopping the vehicle");
	}
}

class Car extends Vehicle {
	@Override
	void start() {
		System.out.println("Starting the car engine");
	}
}

class Bike extends Vehicle {
	@Override
	void start() {
		System.out.println("Kick starting the bike");
	}
}

class Bus extends Vehicle {
	@Override
	void start() {
		System.out.println("Turning on the ignition of the bus");
	}
}

class Driver {
	void drive(Vehicle v) {
		v.start();
		v.stop();
	}
}
