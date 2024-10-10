package com.bptn.course._10_collections.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		//create a TreeSet and populate
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		//add elements
        treeSet.add(50);
		treeSet.add(10);
        treeSet.add(40);
        treeSet.add(30);
        treeSet.add(20);
        //treeSet.add(20); //duplicates aren't printed in TreeSets
        
        System.out.println(treeSet);
        System.out.println("");
        
        //using for loop to traverse
        for(Integer element: treeSet) {
        	System.out.println(element);
        }
        

        System.out.println("");
        
        //check if it contains an element
        System.out.println("Does the TreeSet contain 70?: " + treeSet.contains(70));
        
        System.out.println("");
        
        //check the headset from the TreeSet
        System.out.println("Elements in the headset: " + treeSet.headSet(20));
        
        //check the tailSet from the TreeSet
        System.out.println("Elements in the tailSet: " + treeSet.tailSet(10));
        
        // Get the subSet from the TreeSet
        System.out.println("Elements in the subSet: " + treeSet.subSet(30, 50));
        
        // descendingSet
        NavigableSet<Integer> descendingSet = treeSet.descendingSet();
        System.out.println("Elements in the descendingSet: " + descendingSet);
        
       
        
		
	}

}
