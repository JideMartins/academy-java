package com.bptn.course._10_collections.hashMaps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String,Integer> hashMap = new HashMap<>();
		hashMap.put("Jide", 101);
		hashMap.put("Bola", 102);
		hashMap.put("Dara", 103);
		
		System.out.println(hashMap.get("Dara"));
		
		for (String string : hashMap.keySet()) {
			System.out.println(string + " " + hashMap.get(string));
		}
		
	}

}
