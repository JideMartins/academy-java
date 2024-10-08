package com.bptn.course._10_collections;

import java.util.ArrayList; 

public class ListGetSet {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Diego");
		nameList.add("Grace");
		nameList.add("Deja");
		System.out.println(nameList);

		// add code here
		// get last element
		int size = nameList.size();
		String lastElement = nameList.get(size - 1);
		System.out.println(lastElement);

		nameList.set(0, "Jide");
		System.out.println(nameList);

	}
}
