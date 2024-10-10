package com.bptn.course._10_collections.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("Jide", 101);
		map.put("Bola", 102);
		map.put("Dara", 103);
		map.put("Oyin", 104);
		map.put("Tola", 105);
		map.put("Tope", 106);
		map.put("Jade", 10);
		
		// Iterating a TreeMap using the keySet() method.
        for (String key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // Using the get() method to access a value
        System.out.println("Jide: " + map.get("Jide"));

        // Using the put() method to update the value for a given key
        map.put("Jide", 201);
        System.out.println("Jide's new number : " + map.get("Jide"));

        // Using the remove() method to remove a key-value pair
        map.remove("Jane");
        System.out.println("Bola: " + map.get("Bola"));

        // Using the headMap() method to get a submap of the TreeMap
        System.out.println("HeadMap of the TreeMap: " + map.headMap("Jide"));

        // Using the tailMap() method to get a submap of the TreeMap
        System.out.println("TailMap of the TreeMap: " + map.tailMap("Jide"));

        // Using the subMap() method to get a submap of the TreeMap
        System.out.println("Submap of the TreeMap: " + map.subMap("Dara", "Jide"));

        // Using the firstKey() method to get the first key in the TreeMap
        System.out.println("First key in the TreeMap: " + map.firstKey());

        // Using the lastKey() method to get the last key in the TreeMap
        System.out.println("Last key in the TreeMap: " + map.lastKey());
		

	}

}
