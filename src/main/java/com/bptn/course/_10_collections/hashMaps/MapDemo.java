package com.bptn.course._10_collections.hashMaps;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> numbers = new HashMap<>();

		numbers.put(1, "one");
		numbers.put(2, "two");
		numbers.put(3, "three");
		numbers.put(4, "four");
		numbers.put(5, "five");
		numbers.put(6, "six");
		numbers.put(7, "seven");
		numbers.put(8, "eight");
		numbers.put(9, "nine");
		numbers.put(10, "ten");

		// printing map generated
		for (Integer i : numbers.keySet()) {
			System.out.println(i + " : " + numbers.get(i));
		}

		// remove key 7
		numbers.remove(7);

		// add 11
		numbers.put(11, "eleven");

		// print updated list
		for (Integer i : numbers.keySet()) {
			System.out.println(i + " : " + numbers.get(i));
		}

	}

}
