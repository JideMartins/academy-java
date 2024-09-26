package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {
		String message1 = "This is a test";
	    System.out.println(message1.length());
	    System.out.println(message1.substring(0,3)); //str.substring(index, index + 1)
	    System.out.println(message1.substring(2));
	    System.out.println(message1.indexOf("is"));
	    System.out.println(message1.substring(5));
	    System.out.println(message1.indexOf("Hello"));
	}
}
