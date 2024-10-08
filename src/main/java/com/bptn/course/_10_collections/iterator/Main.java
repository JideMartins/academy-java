package com.bptn.course._10_collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//Make a collection
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    Iterator<String> it = cars.iterator();
	    
	    
	    
	    while (it.hasNext()) {
	    	System.out.println(it.next());
			
		}
	    
	}

}
