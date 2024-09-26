package com.bptn.course._00_self_led;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		
		//instance of random class
		Random number = new Random();
		
		// assign random value  between 0-9999 to variable
        int randomNumber = number.nextInt(10000);

        //print random number
        System.out.println("After execution the Random Number is:" + randomNumber);
        
        //Other method
        int randomNumber02 = (int)(Math.random() * 100) + 1;
        System.out.println("random number between 0 and 100 is:" + randomNumber02);
	}

}
