package com.bptn.course._07_OOP.polymorphism;

public class VehicleMain {
	public static void main(String[] args) {
        Driver d = new Driver();
        d.drive(new Car());
        d.drive(new Bike());
        d.drive(new Bus());
    }
}
