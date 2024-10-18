package com.bptn.course._17_lambdas;

public class Lambda2 {

	// define functional interface
	@FunctionalInterface
	interface myValue {
		double getValue();
	}

	@FunctionalInterface
	interface ActuallyComputeValue {
		double getValue(int x, int y);
	}

	public static void main(String[] args) {
		//
		myValue num1;

		num1 = () -> 42;
		System.out.println("num1 currently has a value of: " + num1.getValue());

		num1 = () -> 23 * 4;
		System.out.println("num1 now has this value :" + num1.getValue());

		num1 = () -> {
			int counter = 1;
			int sum = 0;
			while (counter <= 10) {
				sum = sum + counter;
				counter++;
			}
			return sum;
		};
		System.out.println("new num value: " + num1.getValue());

		// For parameterized lambdas, we reference ActuallyComputeValue functional
		// interface

		ActuallyComputeValue num2;

		num2 = (x, y) -> x * y;
		System.out.println("For num2 wth 5 and 20, the value is " + num2.getValue(5, 20));

		// You can return whatever you want — as long as it matches the return value
		// that the interface is expecting

		num2 = (x, y) -> {
			if (x > 4) {
				return x;
			} else {
				return y;
			}
		};

		System.out.println("For num2 with 3 and 25, the value is " + num2.getValue(3, 25));

	}
	
	
	// Feel free to uncomment the following line and discuss why it does or doesn't work with your class.
	// How does the result support good Java habits? What does it tell you about lambdas?
    //System.out.println("For num2 with 7 and 12.4, the value is " + num2.getValue(7, 12.4));
	
	/**
	 * Its not a good habit because as long as you can return whatever you want,
	 * we have to put it in mind that it must match the return value that the interface is expecting
	 */

}
