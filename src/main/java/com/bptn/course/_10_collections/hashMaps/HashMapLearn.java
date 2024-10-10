package com.bptn.course._10_collections.hashMaps;

import java.util.HashMap;

public class HashMapLearn {

	public static void main(String[] args) {
//		int a = 10;
//		int b = 3;
//		int c = 80;
		
		HashMap<String, Integer> happy = new HashMap<>();
		happy.put("a", 10);
		happy.put("b", 3);
		happy.put("c", 80);
		
		System.out.println(happy);
		System.out.println(happy.get("c"));
		
		
		HashMap<String, String> fun = new HashMap<>();
		fun.put("bobbyJones1996", "fluffyPonies!!");
		fun.put("Chris_Joe", "dogheart24$%");
		fun.put("helloKittyFan21", "AloeVer@!");
		fun.put("wicked_fem", "718shhyeooor+0)#!@");
		
		System.out.println(fun);
		
		fun.remove("Chris_Joe");
		System.out.println(fun);
		
		System.out.println(fun.containsKey("Chris_Joe"));
		System.out.println(fun.containsValue("718shhyeooor+0)#!@"));
		
		System.out.println(fun.size());
		
		//replace
		System.out.println(fun.replace("bobbyJones1996", "P@ssw0rd123456!"));
		System.out.println(fun);
		
		//print values
		System.out.println(fun.values());
		
		//print keys
		System.out.println(fun.keySet());
		
		System.out.println(fun.get("wicked_fem"));
		
	}

}
