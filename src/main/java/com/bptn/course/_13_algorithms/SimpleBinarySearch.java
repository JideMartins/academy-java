package com.bptn.course._13_algorithms;

import java.util.Arrays;

public class SimpleBinarySearch {

	public void Start() {
		// Initial array
		int[] array = { 3, 6, 1, 4, 2, 9, 7, 8, 5, 0 };
		int key = 1;

		// Sort the array
		Arrays.sort(array);

		// Perform binary search on the sorted array
		int result = binarySearch(array, key);

		// Print values in the array after sort
		System.out.println("Sorted Array: " + Arrays.toString(array));
		if (result == -1) {
			System.out.println("Element not present in the array.");
		} else {
			System.out.println("Element found at index: " + result);
		}
	}

	// Binary Search Method
	int binarySearch(int arr[], int key) {
		int min = 0;
		int max = arr.length - 1;

		while (min <= max) {
			// Calculate middle index
			int mid = (min + max) / 2;

			// Check if the key is at mid
			if (arr[mid] == key) {
				return mid; // Key found
			}

			// If key is greater, ignore the left half
			if (arr[mid] < key) {
				min = mid + 1;
			}
			// If key is smaller, ignore the right half
			else {
				max = mid - 1;
			}
		}

		// If we reach here, the key is not present in the array
		return -1;
	}

	public static void main(String[] args) {
		SimpleBinarySearch main = new SimpleBinarySearch();
		main.Start();
	}
}
