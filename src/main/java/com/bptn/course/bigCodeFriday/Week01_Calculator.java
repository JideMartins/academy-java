package com.bptn.course.bigCodeFriday;

import java.util.Scanner;

public class Week01_Calculator {
	public static void main(String[] args) {
		// Create a Scanner object myScanner
		Scanner myScanner = new Scanner(System.in);
		int continueCalculation;

        //Start loop
        do {
            //Calculator menu -- requests for input
            System.out.println("/...Calculator Menu.../");
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for division");
            System.out.println("Press 5 to square a number");
            System.out.println("Press 6 to find a square root");
            System.out.println("Press 7 to find the reciprocal");

            //Read user input
            int userChoice = myScanner.nextInt();

            //declares and initialises variables to store input numbers
            double numberOne, numberTwo;

            //operations based on choice
            if (userChoice == 1) {
                System.out.println("Enter first number: ");
                numberOne = myScanner.nextDouble();
                System.out.println("Enter second number: ");
                numberTwo = myScanner.nextDouble();
                System.out.println("The sum of the numbers " + numberOne + " and " + numberTwo + " is = " + (numberOne + numberTwo));

            } else if (userChoice == 2) {
                System.out.println("Enter first number: ");
                numberOne = myScanner.nextDouble();

                System.out.println("Enter second number: ");
                numberTwo = myScanner.nextDouble();
                System.out.println("The difference between the numbers " + numberOne + " and " + numberTwo + " is = " + (numberOne - numberTwo));

            } else if (userChoice == 3) {
                System.out.println("Enter first number: ");
                numberOne = myScanner.nextDouble();
                System.out.println("Enter second number: ");
                numberTwo = myScanner.nextDouble();
                System.out.println("The product of the numbers " + numberOne + " and " + numberTwo + " is = " + (numberOne * numberTwo));

            } else if (userChoice == 4) {
                System.out.println("Enter first number(dividend): ");
                numberOne = myScanner.nextDouble();
                System.out.println("Enter second number(divisor): ");
                numberTwo = myScanner.nextDouble();

                //check to ensure non-zero input
                if (numberTwo != 0){
                    double quotient = numberOne / numberTwo;
                    double remainder = numberOne % numberTwo;
                    System.out.println("Dividing " + numberOne + " by " + numberTwo + " the quotient is " + quotient + "\nThe remainder is " + remainder);
                } else {
                    System.err.println("Undefined error: Cannot divide by zero.");
                }

            } else if (userChoice == 5) {
                System.out.println("Enter the number to find Square : ");
                numberOne = myScanner.nextDouble();
                //uses the math class nd pow method to find the square --- Math.pow(a,b)
                System.out.println("The Square of the number " + numberOne + " is = " + (Math.pow(numberOne, 2)));

            } else if (userChoice == 6) {
                System.out.println("Enter the number to find Square : ");
                numberOne = myScanner.nextDouble();
                //Square root a^(1/2)
                System.out.println("The Square root of the number " + numberOne + " is = " + (Math.sqrt(numberOne)));

            } else if (userChoice == 7) {
                System.out.println("Enter the number to find Reciprocal : ");
                numberOne = myScanner.nextDouble();

                //check to ensure non-zero input
                if (numberOne !=0) {
                    //if true print the reciprocal = 1/n
                    System.out.println("The Reciprocal of the number " + numberOne + " is = " + (1 / numberOne));
                } else {
                    //Prints in error format
                    System.err.println("Undefined error: Cannot find reciprocal of zero.");
                }

            } else {
                //print invalid choice
                System.out.println("Invalid choice! Please make a valid choice");
            }

            //Ask user to continue using calculator or exit
            System.out.println("To continue calculation Press 1, else press any other number to exit");
            continueCalculation = myScanner.nextInt();

        } while (continueCalculation == 1);{
            myScanner.close();
            System.out.println("Calculator program ended.");
        }
	}
}
