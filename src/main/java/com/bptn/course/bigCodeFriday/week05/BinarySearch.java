package com.bptn.course.bigCodeFriday.week05;

import java.util.Arrays;

public class BinarySearch {

	// Binary search method that takes an unsorted array and a key element to search
	// for
	public static int binarySearch(int[] arr, int key) {
		// Sort the array before applying binary search
		Arrays.sort(arr);

		// Initialize low and high pointers for the start and end of the array
		// respectively
		int low = 0;
		int high = arr.length - 1;

		// Keep looping until the high pointer is greater than or equal to the low
		// pointer
		while (low <= high) {
			// Calculate the middle index
			int middle = (low + high) / 2;

			// If the element at the middle index is equal to the key, return the index
			if (arr[middle] == key) {
				return middle;
			}
			// If the element at the middle index is less than the key, move the low pointer
			// to the middle + 1
			else if (arr[middle] < key) {
				low = middle + 1;
			}
			// If the element at the middle index is greater than the key, move the high
			// pointer to the middle - 1
			else {
				high = middle - 1;

			}
		}
		// If the key is not found, return -1
		return -1;
	}

	public static void main(String[] args) {
		// Create an Array of integers
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		// Key to be searched for:
		int key = 22;

		// Perform binary search on the Array
		int result = binarySearch(arr, key);

		// Print the result
		if (result == -1) {
			System.out.println("Element not found in the array");
		} else {
			System.out.println("Element found at index " + result);
		}
	}

	/**
	 * Arrays.sort ensures the array is sorted before applying binary search while
	 * loop continues as long as low is less than or equal to high the while loop
	 * returns if key isn't found Middle calculation finds the midpoint of the
	 * current range
	 * 
	 * conditions ============= 
	 * if the middle element is the key, return index
	 * if the middle element is less than the key, update low to middle + 1; 
	 * if it is less, update high to middle -1
	 * 
	 */

}
