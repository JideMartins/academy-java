package com.bptn.course.bigCodeFriday;

import java.util.Scanner;

public class Week01_WordEncryption {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a string: ");
        String originalStr = myObj.nextLine();

        //Initialize an empty StringBuilder to store encrypted word
        StringBuilder encryptedStr = new StringBuilder();

        //iterate through each character of user input
        for (int i = 0; i < originalStr.length(); i++) {
            char currentChar = originalStr.charAt(i);

            //check for uppercase, lowercase and integer
            if (currentChar >= 'A' && currentChar <= 'Z') {
                //shifting the letter by one position
                char shiftedChar = (char) ((currentChar - 'A' + 1) % 26 + 'A');
                encryptedStr.append(shiftedChar);

            } else if (currentChar >= 'a' && currentChar <= 'z') {
                //shifting the letter by one position
                char shiftedChar = (char) ((currentChar - 'a' + 1) % 26 + 'a');
                encryptedStr.append(shiftedChar);

            } else {
                encryptedStr.append(currentChar); //append as it is
            }

        }
        myObj.close();
        //print out the encrypted string
        System.out.println("Encrypted word: " + encryptedStr);

	}

}
