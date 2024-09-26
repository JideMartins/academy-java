package com.bptn.course._00_self_led;

import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
		System.out.println("Enter the string to check for palindrome: ");
        
		Scanner scanner = new Scanner(System.in);
		//Declare variable to receive user input
        String input = scanner.nextLine();
        
        //reverse of input stored in another variable
        String reverseInput = "";
        

        //compare both variable values
        for (int i = input.length() - 1; i >= 0; i--) {
            reverseInput += input.charAt(i);
        }

        //if same, print palindrome, else it isn't
        if (input.toLowerCase().equals(reverseInput.toLowerCase())) {
            System.out.println("Input string is palindrome");
        } else {
            System.out.println("Input string is not palindrome");
        }
	}

}
