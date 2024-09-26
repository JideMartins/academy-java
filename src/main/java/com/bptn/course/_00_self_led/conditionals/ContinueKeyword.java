package com.bptn.course._00_self_led.conditionals;

public class ContinueKeyword {

	public static void main(String[] args) {
	        for(int i = 0; i <= 6; i++) {
	            
	        	//skip iteration when i = 4 and continue to the next iteration
	        	if(i == 4) {
	                continue;
	            }
	            System.out.println(i);
	        }
	        
	        //execute when the iteration ends
	        System.out.println("We've finished the loop!");

	}

}
