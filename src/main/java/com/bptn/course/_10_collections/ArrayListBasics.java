package com.bptn.course._10_collections;

import java.util.ArrayList;

public class ArrayListBasics {

	public static void main(String[] args) {
		// declare arraylist
		ArrayList<String> nameList = null;
		System.out.println(nameList);
		
		//allocate memory
		nameList = new ArrayList<String>();
		System.out.println("Size of array: " + nameList.size());
		
		// add without index
		nameList.add("Andrea");
		System.out.println(nameList);
		
		nameList.add("Jide");
		System.out.println(nameList);
		
		nameList.add("Ayomide");
		System.out.println(nameList);
		
		nameList.add("Hussein");
		System.out.println(nameList);
		
		nameList.add("Bolzee");
		System.out.println(nameList);
		
		System.out.println("Updated size is: " + nameList.size());
		
		System.out.println("====================");
		
		// add with index
		nameList.add(3, "Dara");
		System.out.println(nameList);
		System.out.println("Updated size is: " +nameList.size());
		
		nameList.add(5, "Oyinade");
		System.out.println(nameList);
		System.out.println("new size after adding Oyinade: " + nameList.size());
		
		System.out.println("====================");
		
		// get - to get the value at a given index
		System.out.println("Name at index 5 is: " + nameList.get(5));
		System.out.println("Name at index o is: "+nameList.get(0));
		
		//set - replaces the value at a given index
		nameList.set(0, "Omotola");
		System.out.println(nameList);
		System.out.println("new size after adding Oyinade: " + nameList.size());
		
		//remove
		nameList.remove(2);
		nameList.remove(3);
		System.out.println(nameList);
		
	}

}
