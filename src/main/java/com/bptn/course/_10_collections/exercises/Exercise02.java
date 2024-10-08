package com.bptn.course._10_collections.exercises;

import java.util.Set;

public class Exercise02 {

	public static void main(String[] args) {
		//Write a java program that compares 2 sets of Strings to determine whether they are equal
		Set<String> set1 = Set.of("Heebro","Don Akolab", "Oyinade", "dbkooper", "Otore", "");
		Set<String> set2 = Set.of("Heebro","Don Akolab", "Oyinade", "dbkooper", "Otore", "Tofbalzy");
		
		//easy way out
		boolean areSetsEqual = set1.equals(set2);
		System.out.println(areSetsEqual);
		
		boolean equals =checkEquals(set1, set2);
		System.out.println(equals);
		
		

	}
	
	//create static so you can call it in the main method
	static boolean checkEquals(Set<String> set1, Set<String> set2) {
		if (set1.size() != set2.size()) {
			return false;
		}
		for (String str: set1) {
			if (!set2.contains(str)) {
				return false;
			}
		}
		return true;
	}
	
	static boolean equalCheck(Set<String> set1, Set<String> set2) {
		boolean areEqual = set1.containsAll(set2) && set2.containsAll(set1);
		//boolean areEquals2 = set1.size()==set2.size();
		if (!areEqual) {
			return false;
		}
		return true;
	}

	
	
}
