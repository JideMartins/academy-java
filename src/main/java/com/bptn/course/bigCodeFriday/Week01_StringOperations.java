package com.bptn.course.bigCodeFriday;

import java.util.Scanner;

public class Week01_StringOperations {
	public static void main(String[] args) {
		Scanner myObject = new Scanner(System.in);
        int continueOps;

        do {
            System.out.println("/…String Menu…/");
            System.out.println("Press 1 for Palindrome Check");
            System.out.println("Press 2 to reverse a String");
            System.out.println("Press 3 to Concatenate two Strings");
            System.out.println("Press 4 for String Comparison");
            System.out.println("Press 5 to Calculate the Length of String");

            //collect user input
            int userInput = myObject.nextInt();
            //declare input string variables
            String strOne;
            String strTwo;

            switch (userInput) {
                case 1:
                    System.out.println("Enter a string:");
                    strOne = myObject.next();
                    //reversing string
                    String reversed = new StringBuilder(strOne).reverse().toString();

                    //check for palindrome
                    if (reversed.equals(strOne)) {
                        System.out.println(strOne + " is a palindrome.");
                    } else {
                        System.out.println(strOne + " is not a palindrome");
                    }

                    break;

                case 2:
                    System.out.println("Enter a string:");
                    strOne = myObject.next();

                    //reversing string
                    String revString = new StringBuilder(strOne).reverse().toString();
                    System.out.println(revString);

                    break;

                case 3:
                    System.out.println("Enter First string: ");
                    strOne = myObject.next();
                    System.out.println("Enter second string: ");
                    strTwo = myObject.next();

                    //print concatenated string
                    System.out.println(strOne.concat(strTwo));
                    break;

                case 4:
                    System.out.println("Enter First string: ");
                    strOne = myObject.next();
                    System.out.println("Enter second string: ");
                    strTwo = myObject.next();
                    if (strOne.equals(strTwo)) {
                        System.out.println("The entered strings are equal");
                    } else {
                        System.out.println("The entered strings are not equal");
                    }
                    break;

                case 5:
                    System.out.println("Enter a string:");
                    strOne = myObject.next();
                    System.out.println("The length of the entered string is: " + strOne.length());

                    break;

                default:
                    System.out.println("Invalid choice! Please make a valid choice.");
            }

            System.out.println("Press 1 to continue program, or press another number");
            continueOps = myObject.nextInt();

        } while (continueOps == 1);
        {
            System.out.println("Program ended");
        }
        
        myObject.close();
	}
	

}

/*
Summary
=====================
program executes operations on strings.
I faced a logic error preventing input for strings when using nextLine() for string operations.When using nextLine() to read the first string, the program skips the first input and moves to the second prompt. It does not allow the user to enter the first string.
I had to use next() instead.
Another issue was the reversal and palindrome check. I wanted to create a method that reverses string input so that I can call it for case 1 and case 2. In the end, I ran into some issues (which meant that I'd have to read further on them). I resorted to using the StringBuilder reverse()
*/