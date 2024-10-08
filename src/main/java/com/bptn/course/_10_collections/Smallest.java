package com.bptn.course._10_collections;

import java.util.ArrayList;

public class Smallest {

	public static void moveSmallest(ArrayList<Integer> list) {
		int smallestIndex = 0;
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) < list.get(smallestIndex)) {
				smallestIndex = i;
			}
		}
		// move smallest to front
		int smallestValue = list.get(smallestIndex);
		list.remove(smallestIndex);
		list.add(0, smallestValue);
	}

	public static void main(String[] args) {
		// instantiate ArrayList and fill with Integers
		ArrayList<Integer> values = new ArrayList<Integer>();
		int[] nums = { 3, 11, 54, 7, 1, 22 };
		for (int i = 0; i < nums.length; i++) {
			values.add(nums[i]);
		}
		moveSmallest(values);
		System.out.println("Expected Result: [1, 3, 11, 54, 7, 22]");
		System.out.println("Your Result: " + values);
	}
}

/*
 * 
 * Explanation:
 * ========================= 
 * Initialize smallestIndex: The smallestIndex variable is initialized to 0,
 * assuming the first element is initially the smallest.
 * 
 * Find the smallest index: The for loop iterates through the list starting from the second
 * element (index 1). It compares each element with the current smallest element
 * at smallestIndex. If the current element is smaller, the smallestIndex is
 * updated to the current index.
 * 
 * Move smallest to front: After the loop, the smallestValue is extracted from
 * the list at the smallestIndex. The element at smallestIndex is removed from
 * the list using remove(smallestIndex). Finally, the smallestValue is inserted
 * at the beginning of the list using add(0, smallestValue), effectively moving
 * the smallest element to the front.
 * 
 */