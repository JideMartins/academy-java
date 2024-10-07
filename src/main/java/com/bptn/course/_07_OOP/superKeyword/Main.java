package com.bptn.course._07_OOP.superKeyword;

public class Main {

	public static void main(String[] args) {
		Hero hero1 = new Hero("Batman", 42, "$$$");
		Hero hero2 = new Hero("Sperman", 43, "Super everything");
		
		System.out.println(hero1.toString());
		System.out.println();
		System.out.println(hero2.toString());
	}

}
