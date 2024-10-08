package com.bptn.course._10_collections;

import java.util.ArrayList;
import java.util.List;

public class ConvertToArrayList {

	// Complete the functionality of the method below
	public static List<String> convertArrayToList(String[] inputArray) {

		// Create a new ArrayList of String.
		List<String> list = new ArrayList<>();

		// Iterate inputArray using a for-each loop and add the elements to the new
		// ArrayList. Hint: Use add() method to add elements to ArrayList.
		for (String element : inputArray) {
			list.add(element);

		}

		// return the new list with elements.
		return list;
	}

	// main() method to run the convertArrayToList() Method
	public static void main(String[] args) {
		String[] cars = { "Volvo", "Honda", "Ford" };

		List<String> arraylist = convertArrayToList(cars);

		System.out.println(arraylist);
	}
}
