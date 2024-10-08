package com.bptn.course._10_collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSetExample {

	public static void main(String[] args) {
		Set<String> set1 = Set.of("John", "Pete", "Mike", "Jay");//Unmodifiable
		Set<String> set2 = new HashSet<String>(Set.of("John", "Pete", "Mike", "Jay"));//Modifiable
		
		System.out.println(set1);
		System.out.println(set2);
		
		List<String> list = new ArrayList<String>();
		list.add("Jide");
		list.add("Jide");
		list.add("Jide");
		list.add("Dara");
		list.add("Dara");
		list.add("Bola");
		list.add("ola");
		
		//sets can remove duplicates
		Set<String> set3 = new HashSet<String>(list); //converts the list to set
		System.out.println(set3);
		
		//or if we are yet to have the list
		Set<String> set4 = new HashSet<String>(); //use LinkedHashSet if you want to preserve insertion order
		set4.addAll(list);
		System.out.println(set4);
		
		List<String> list1 = new ArrayList<String>(List.of("Heebro","Don Akolab", "Oyinade", "dbkooper", "Otore", "Tofbalzy"));
		List<String> list2 = new ArrayList<String>(List.of("Samah","Dupe", "Bidola", "Queenie", "Tutulyn"));
		System.out.println(list1);
		System.out.println(list2);
		list1.addAll(list2);
		
		System.out.println(list1);
	}

}
