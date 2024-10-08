package com.bptn.course._10_collections.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Remove {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(6);
		numbers.add(40);
		numbers.add(22);
		
		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			Integer i = iterator.next();
			if (i<10) {
				iterator.remove();
			}
			
		}
		System.out.println(numbers);
		
	}
}
