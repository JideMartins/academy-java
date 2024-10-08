package com.bptn.course._10_collections;

import java.util.ArrayList;

public class WrapperBasics {

	public static void main(String[] args) {
		//declare and allocate memory
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println(numbers);
		
		// add without index
		numbers.add(1); // autoboxing
		numbers.add(6);
		numbers.add(21);
		numbers.add(4);
		numbers.add(Integer.valueOf(7)); // no boxing necessary
		numbers.add(Integer.valueOf(8));
		System.out.println(numbers);
		
		//add with index
		numbers.add(0, 80);
		System.out.println(numbers);
		
		//get
		System.out.println("Value at index 6 is: " + numbers.get(6));
		int x = numbers.get(2); //unboxing example
		System.out.println("Value at index 2 is: " + x);
		
		//set
		numbers.set(0, 3);
		System.out.println(numbers);
		
		//remove
		numbers.remove(3);
		System.out.println(numbers);
	}

}
