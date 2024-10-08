package com.bptn.course._10_collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);

        System.out.println(set);
        System.out.println(set.size());
        Object[] setArray = set.toArray();
        System.out.println(setArray.toString());

	}

}
