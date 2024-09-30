package com.bptn.course.bigCodeFriday;

import java.util.Scanner;

public class Week01_PluralForm {
    public static void main(String[] args) {
        Scanner scnObj = new Scanner(System.in);
        StringBuilder word;

        //initialize variables
        int amount;
        String last2Chars, lastChar; //last characters and last two characters
        StringBuilder cutOut; //declare cutOut variable

        //Ask for user input and read input to variables
        System.out.println("Enter amount:");
        amount = scnObj.nextInt();
        System.out.println("Enter word");
        word = new StringBuilder(scnObj.next());

        //compare inputs and print
        if (amount > 1 || amount == 0) {
            //get the last two characters
            last2Chars = word.substring((word.length() - 2), (word.length()));
            //get the last character
            lastChar = word.substring(word.length() - 1);

            //create booleans to be used for conditionals
            boolean endsWithFe = last2Chars.equalsIgnoreCase("fe");
            boolean endsWithAy = last2Chars.equalsIgnoreCase("ay");
            boolean endsWithOy = last2Chars.equalsIgnoreCase("oy");
            boolean endsWithEy = last2Chars.equalsIgnoreCase("ey");
            boolean endsWithUy = last2Chars.equalsIgnoreCase("uy");
            boolean endsWithUs = last2Chars.equalsIgnoreCase("us");
            boolean endsWithSh = last2Chars.equalsIgnoreCase("sh");
            boolean endsWithCh = last2Chars.equalsIgnoreCase("ch");
            boolean endsWithY = lastChar.equalsIgnoreCase("y");


            if (endsWithFe) {
                //create a cutout where the last 2 characters are deleted
                //return a string value to cutout "fe"
                cutOut = word.delete((word.length() - 2), (word.length()));
                //append "ves"
                StringBuilder plural = cutOut.append("ves");
                System.out.println(amount + " " + plural);

            } else if (endsWithAy || endsWithOy || endsWithEy || endsWithUy) {
                //add "s"to the word
                StringBuilder plural = word.append("s");
                System.out.println(amount + " " + plural);

            } else if (endsWithCh || endsWithSh) {
                //adds "es" to plural and prints
                StringBuilder plural = word.append("es");
                System.out.println(amount + " " + plural);

            } else if (endsWithUs) {
                //delete the last two characters
                cutOut = word.delete((word.length() - 2), (word.length()));
                //add "i" to cut out and return the value to plural then print
                StringBuilder plural = cutOut.append("i");
                System.out.println(amount + " " + plural);

            } else if (endsWithY) {
                //deletes the last character
                cutOut = word.deleteCharAt((word.length() - 1));
                StringBuilder plural = cutOut.append("ies");
                System.out.println(amount + " " + plural);

            } else {
                StringBuilder plural = word.append("s");
                System.out.println(amount + " " + plural);
            }

        } else if (amount == 1) {
            //print
            System.out.println(amount + " " + word);

        } else {
            System.out.println("Failed: please enter a non negative number");
        }
        
       scnObj.close();
    }
}

/*

Summary
================
1. This code tries to form plurals to strings. The most challenging part of this code was trying to meet all conditions while playing with the strings.
2. The code was bulky because of repeated results for certain conditions, for example: words ending
with -ay,-oy,-ey,-uy, not mentioning other conditions.
3. To fix this, I initialized booleans with conditions that tally with the problem statement.
4. These booleans have been named intuitively eg endsWithAy.
5. Another issue was getting the last two characters.
6. I was able to gt it with last2Chars = word.substring((word.length() - 2), (word.length() -1));
The issue with this was that it was returning false because I inserted the wrong bounds.
I fixed this by using  last2Chars = word.substring((word.length() - 2), (word.length()));
for example String "day" would have words.substring(1,2) which will be wrong. correct one is words.substring(1,3)


Additions
==============
1. I added a condition for printing error if a negative number is inputted.

*/