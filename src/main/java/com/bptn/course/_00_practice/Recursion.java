package com.bptn.course._00_practice;

public class Recursion {

	public static void main(String[] args) {
		sayHi(3);

	}
	
	private static void sayHi(int count){
		System.out.println("Hi!");
		
		//Implement base case
		if (count <= 1){
			return;
		}
		
		//implement something that always returns to the base case
		//This was done by adding the sayHi(int count) at the start and then this next line
		sayHi(count -1);
	}

}
