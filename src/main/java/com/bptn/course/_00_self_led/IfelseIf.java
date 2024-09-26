package com.bptn.course._00_self_led;

import java.util.Scanner;

public class IfelseIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("\n\n You are on an island surrounded by water.\n There is a path to the woods to the north, the sea to the south, and a beach shack to the east. \n Which way do you want to go (n,e,s,w)?");
        
        //assign user input to variable
        String command = scan.nextLine();
        if (command.equals("n")) {
            System.out.println("You enter the forest and hear some rustling. \nThere may be tigers here or maybe it's just monkeys.");
        // Add else-ifs for s, e, w, and an else for any other input. Be creative!
          
        } else if (command.equals("e")){
            System.out.println("You are now entering the beach shack!");
        } else if (command.equals("s")){
            System.out.println("You are now at the sea! \nthe great beyond. ");
        } else if (command.equals("w")){
            System.out.println("You are now headed west!");
        } else {
            System.out.println("End of adventure!");
        }
        
        //close Scanner
        scan.close();

	}

}
