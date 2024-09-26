package com.bptn.course._00_self_led.conditionals;

public class BreakKeyword {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
            
			//set a condition to stop the loop when i = 4
			if(i == 4) {
                break;
            }
            System.out.println(i);
        }
		
		//executes when the loop ends
        System.out.println("We've broken out of the loop!");

	}

}
