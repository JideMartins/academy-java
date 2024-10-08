package com.bptn.course._10_collections.exercises;

import java.util.HashSet;
import java.util.Set;

public class Exercise03 {

	public static void main(String[] args) {
		
		/*
		 * Write a program that compares 2 sets of Strings and create a 3rd set with the
		 * common String
		 */
		
		
		Set<String> set1 = Set.of("Heebro","Don Akolab", "Oyinade", "dbkooper", "Otore", "Deolu");
		Set<String> set2 = Set.of("Deolu","Don Akolab", "Oyinade", "Oyinda", "Otore", "Tofbalzy");
		
		Set<String> set3 = getCommon(set1, set2); //or var set 3
		System.out.println(set3);

	}
	static Set<String> getCommon(Set<String> set1, Set<String> set2) {
		
		Set<String> set3 = new HashSet<>();
	
		for (String str: set1) {
			if (set2.contains(str)) {
				set3.add(str);
			}else {
				System.out.println(str + " is not present in set2");
			}
		}
	}
	

}
