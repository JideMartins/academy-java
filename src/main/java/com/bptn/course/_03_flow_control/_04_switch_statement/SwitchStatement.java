package com.bptn.course._03_flow_control._04_switch_statement;

public class SwitchStatement {

	public static void main(String[] args) {
		int day = 3;
		
		switch (day) {  //you cannot have ranges with switch, only exact values
		case 1:
			System.out.println("Monday!");
			break;
		case 2:
			System.out.println("Tuesday!");
			break;
		case 3:
			System.out.println("Wednesday!");
			break;
		case 4:
			System.out.println("Thursday!");
			break;
		case 5:
			System.out.println("Friday!");
			break;
		case 6:
			System.out.println("Saturday!");
			break;
		case 7, 8, 9:
			System.out.println("Sunday!");
		default:
			System.out.println("invalid day");
		}
		
		//simplified switch: Java 14 and beyond
		
		switch(day) {
		case 1 -> System.out.println("Monday!");
		case 2 -> System.out.println("Tuesday!");
		case 3 -> System.out.println("Wednesday!");
		case 4 -> System.out.println("Thursday!");
		case 5 -> System.out.println("Friday!");
		case 6 -> System.out.println("Saturday!");
		case 7,8,9 -> System.out.println("Sunday!");
		default-> System.out.println("Invalid input");
		}
		
		//simplified switch-return value: Java 14 
		
		/*String str = switch(day) {
		case 1 -> "Monday!";
		case 2 -> "Tuesday!";
		case 3 -> "Wednesday!";
		case 4 -> "Thursday!";
		case 5 -> "Friday!";
		case 6 -> "Saturday!";
		case 7,8,9 -> "Sunday!";
		default-> "Invalid input";
		}*/

	}
}
