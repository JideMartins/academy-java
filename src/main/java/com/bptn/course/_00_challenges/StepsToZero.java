package com.bptn.course._00_challenges;

public class StepsToZero {
	public static int numberOfSteps(int num) {
        int steps = 0;

        // While the number is not zero, perform the steps
        while (num > 0) {
            if (num % 2 == 0) {
                // If the number is even, divide by 2
                num /= 2;
            } else {
                // If the number is odd, subtract 1
                num -= 1;
            }
            // Increment step count after each iteration of loop
            steps++;
        }

        return steps;
	}
	
	public static void main(String[] args) {
		// Test 1
        int num = 123;
        int steps = numberOfSteps(num);
        System.out.println("Number of steps to reduce " + num + " to zero: " + steps);

        // Test 2
        num = 14;
        steps = numberOfSteps(num);
        System.out.println("Number of steps to reduce " + num + " to zero: " + steps);
	}

}
