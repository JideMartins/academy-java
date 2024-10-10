package com.bptn.course._10_collections.hashMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EmployeeIDs {

	public static void main(String[] args) {
		Map<String, Integer> employeeIDs = new HashMap<>();
		
		employeeIDs.put("John", 12345);
		employeeIDs.put("Carl", 12346);
		employeeIDs.put("Jide", 12347);
		employeeIDs.put("Ola", 12348);
		
		System.out.println(employeeIDs);
		System.out.println(employeeIDs.get("Jide"));
		
		employeeIDs.put("Jide", 54321);
		System.out.println(employeeIDs);
		
		employeeIDs.putIfAbsent("Jide", 25648);
		System.out.println(employeeIDs);
		
		//using keySet() too loop through
		for(String i: employeeIDs.keySet()) {
			System.out.println(i);
		}
		
		//using values to loop through
		for(Integer i:employeeIDs.values()) {
			System.out.println(i);
		}
		
		
		//using keySet() too loop through
		for(String i: employeeIDs.keySet()) {
			System.out.println("key: " + i + " value: " + employeeIDs.get(i));
		}
		
		
		
		

	}

}
