package com.bptn.course._00_challenges;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner myObject = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
        int n = myObject.nextInt();

        // Fetch the input from the user and store in the variable called n


        int first = 0; // First element of Fibonacci series
        int second = 1; // Second element of Fibonacci series

        if (n > 0) {
            System.out.print("Fibonacci Series up to " + n + " elements: ");

            // Print the first n elements of Fibonacci series
            for (int i = 0; i < n; i++) {
                System.out.print(first + " ");
                int nextNumber = first + second;
                first = second;
                second = nextNumber;

                // Fill in the missing piece of code below to print the elements

            }
        } else {
            System.out.println("Please insert a positive value");
        }

        myObject.close();

	}

}
