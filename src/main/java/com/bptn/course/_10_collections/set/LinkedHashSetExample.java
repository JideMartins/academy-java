package com.bptn.course._10_collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// create a LinkedHashSetExample
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		//add elements
		set.add("dog");
        set.add("cat");
        set.add("mouse");
        set.add("tiger");
        set.add("lion");
        
        System.out.println("Setsize: " + set.size());
        System.out.println("===============");
        
        //use for loop to print elements in the set
        System.out.println("Elements in the set (using for-each loop):");
        for (String element : set) {
			System.out.println(element);
		}
        System.out.println("===============");
        
        // use iterator to print the elements in the set
        Iterator<String> iterator = set.iterator();
        System.out.println("Elements in the set (using iterator):");
        while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
        
        
        //check if an element exists 
        System.out.println(set.contains("mouse"));
        
        //set.clear() removes all elements in the set

	}

}
