package com.bptn.course._17_lambdas;

import java.util.ArrayList;

public class ArrayListModification {

	public static void main(String[] args) {
		// Create an ArrayList
		ArrayList<String> languages = new ArrayList<String>();

		// Add elements to the ArrayList
		languages.add("java");
		languages.add("javascript");
		languages.add("swift");
		languages.add("python");

		System.out.println("Original ArrayList:");
		// Print the original ArrayList using forEach and a lambda
		languages.forEach(e -> System.out.println(e));

		// Modify all elements to uppercase using replaceAll()
		languages.replaceAll(e -> e.toUpperCase());

		System.out.println("\nUpdated ArrayList:");
		// Print the updated ArrayList using forEach and a lambda
		languages.forEach(e -> System.out.println(e));

	}

}
