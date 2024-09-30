package com.bptn.course.bigCodeFriday;

import java.util.Scanner;

public class Week01_NumberGuessingGame {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

        //number to be guessed
        int targetNumber = 23;
        int guess; //user input guess variable

        do {
            System.out.println("Enter number:");
            guess = obj.nextInt();

            //if statement with conditions
            if (guess == targetNumber) {
                System.out.println("Congratulations! You guessed the number correctly!");
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");

            } else if (guess > targetNumber && guess <= 100) {
                System.out.println("Too high! Try again.");
            } else if (guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            }
        }

        //keep running the loop until the number is guessed correctly
        while (guess != targetNumber);
        {
            System.out.println("Congratulations! You guessed the number correctly!");
        }
        obj.close();
    }
}
/*
Summary
==================
This program collects a value from the user input, stores it in a variable and compares it to a target number.
To make sure that the code is run as long as the number isn't guessed correctly, I used a do-while loop to ensure that it continues running.
2. This may have been a bit different if I used a normal while loop, but i wanted to learn the do-while loop
3. I preferred using the if statements rather than the switch statements since I can use the conditions.
*/
