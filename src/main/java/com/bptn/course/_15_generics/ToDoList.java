package com.bptn.course._15_generics;

import java.util.LinkedList;

//tell class to take in a generic type with <T>
public class ToDoList<T> {
	//We can use that T wherever we need to define a type:
	private LinkedList<T> items = new LinkedList<>();   //instead of new LinkedList<T>();
	public T addItemToList(T item) {
		//code to add items to list and return an element of type T
		return item;
	}
}
