package com.bptn.course._17_lambdas;

interface Sayable{
	String say();
}

/*
 * class MyClass implements Sayable{
 * 
 * @Override public String say() { return "I love Java"; } }
 */


public class LambdasExample {

	public static void main(String[] args) {
		//Sayable obj = new MyClass();
		//System.out.println(obj.say());
		
		Sayable obj2 = () -> {
			return "Ilove Java";
		};
		System.out.println(obj2.say());

	}

}
