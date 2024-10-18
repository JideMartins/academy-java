package com.bptn.course._15_generics.pair;

public class Main {

	public static void main(String[] args) {
		// Example One:
		Pair<Integer, String> p1 = new Pair<>(1, "apple"); 
		Pair<Integer, String> p2 = new Pair<>(2, "pear"); 
		// In this line, we've declared the types for our values explicitly: Integer and String respectively. This code will run and compare the two key value pairs according to the methods defined above:
		boolean same = Util.<Integer, String>compare(p1, p2);
		System.out.println(same);

		// However, we don't have to define the types at all for example with Util.compare below. Because we've used the generic method, it will take care of "inferring" the types of our values and maintain them throughout its code blocks: 
		Pair<Integer, String> p3 = new Pair<>(1, "apple"); 
		Pair<Integer, String> p4 = new Pair<>(2, "pear"); 
		boolean same1 = Util.compare(p1, p2);
		System.out.println(same1);

	}

}
