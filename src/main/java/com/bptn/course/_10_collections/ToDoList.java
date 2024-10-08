package com.bptn.course._10_collections;

import java.util.ArrayList;

public class ToDoList {

	public static void main(String[] args) {
		/*
		 * // Rewrite this code to use an ArrayList instead of an array String[]
		 * toDoList = new String[3]; toDoList[0] = "Do homework"; toDoList[1] =
		 * "Help make dinner"; toDoList[2] = "Call grandma";
		 * 
		 * // changing element at index 1 toDoList[1] = "Order pizza";
		 * 
		 * System.out.println(toDoList.length + " things to do!");
		 * System.out.println("Here's the first thing to do: " + toDoList[0]);
		 * 
		 * // remove item 0 and move everything down // (this can be done in 1 command
		 * with ArrayList) toDoList[0] = toDoList[1]; toDoList[1] = toDoList[2];
		 * toDoList[2] = "";
		 * 
		 * System.out.println("Here's the next thing to do: " + toDoList[0]);
		 */
		ArrayList<String> toDoList = new ArrayList<String>();
		toDoList.add("Do homework");
		toDoList.add("Help make dinner");
		toDoList.add("Call grandma");
		
		//changing element at index 1
		toDoList.set(1, "Order pizza");
		
		System.out.println(toDoList.size() + " things to do!");
		System.out.println("Here's the first thing to do: " + toDoList.get(0));
		
		toDoList.set(0, toDoList.get(1));
		toDoList.set(1, toDoList.get(2));
		toDoList.remove(2);
		
		System.out.println("Here's the next thing to do: " + toDoList.get(0));
		
		

	}

}
