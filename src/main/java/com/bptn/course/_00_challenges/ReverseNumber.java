package com.bptn.course._00_challenges;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner myObject = new Scanner(System.in);
		System.out.println("Enter number: ");
		
		int userInput = myObject.nextInt();
		int reversedValue = 0;
		
		while(userInput != 0) {
			int singleDigit = userInput%10;
			reversedValue = reversedValue*10 + singleDigit;
			userInput/=10;
			
		}
		
		System.out.println(reversedValue);
		

	}

}
