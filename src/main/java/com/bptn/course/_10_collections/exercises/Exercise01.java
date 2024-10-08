package com.bptn.course._10_collections.exercises;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise01 {

	public static void main(String[] args) {
		/*
		 * Write a Java program that, given a List of Strings, prints out the unique
		 * elements only.
		 */
		
		List<String> str = List.of("Heebro","Don Akolab", "Oyinade", "dbkooper", "Otore", "Tofbalzy");
		
		Set<String> set = new HashSet<>(str);
		System.out.println(str);

	}

}
